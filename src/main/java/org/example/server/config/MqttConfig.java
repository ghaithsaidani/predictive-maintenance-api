package org.example.server.config;


import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.example.server.dto.SensorDTO;
import org.example.server.services.TirePressureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.core.MessageProducer;
import org.springframework.integration.mqtt.core.DefaultMqttPahoClientFactory;
import org.springframework.integration.mqtt.core.MqttPahoClientFactory;
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;
import org.springframework.integration.mqtt.support.DefaultPahoMessageConverter;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import java.util.Date;

@Configuration
@Slf4j
public class MqttConfig {
    @Value("${mqtt.broker.url}")
    private String brokerUrl;
    @Value("${mqtt.username}")
    private String username;
    @Value("${mqtt.password}")
    private String password;
    @Value("${mqtt.client.id}")
    private String clientId;
    @Value("${mqtt.topics.wildcard}")
    private String TOPICS;
    private final SimpMessagingTemplate messagingTemplate;
    private final TirePressureServiceImpl tirePressureService;
    @Autowired
    public MqttConfig(SimpMessagingTemplate messagingTemplate, TirePressureServiceImpl tirePressureService) {
        this.messagingTemplate = messagingTemplate;
        this.tirePressureService = tirePressureService;
    }
    @Bean
    public MqttPahoClientFactory mqttClientFactory() {
        DefaultMqttPahoClientFactory factory = new DefaultMqttPahoClientFactory();
        MqttConnectOptions options = new MqttConnectOptions();
        options.setServerURIs(new String[] { brokerUrl });
        options.setUserName(username);
        options.setPassword(password.toCharArray());
        factory.setConnectionOptions(options);
        return factory;
    }

    @Bean
    public MessageChannel mqttInputChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageProducer inbound() {
        MqttPahoMessageDrivenChannelAdapter adapter =
                new MqttPahoMessageDrivenChannelAdapter(clientId, mqttClientFactory(),TOPICS);
        adapter.setCompletionTimeout(5000);
        adapter.setConverter(new DefaultPahoMessageConverter());
        adapter.setQos(1);
        adapter.setOutputChannel(mqttInputChannel());
        return adapter;
    }

    @Bean
    @ServiceActivator(inputChannel = "mqttInputChannel")
    public MessageHandler handler() {
        return message -> {
            String topic = (String) message.getHeaders().get(MqttHeaders.RECEIVED_TOPIC);
            String payload = (String) message.getPayload();
            SensorDTO sensorData = processPayload(topic.split("/")[1],payload);
            if(topic.equals("sensors/fuel_flow"))
            {
                messagingTemplate.convertAndSend("/sensors/fuel_flow", sensorData);
            }
            if(topic.equals("sensors/energy_consumption"))
            {
                messagingTemplate.convertAndSend("/sensors/energy_consumption", sensorData);
            }
            if(topic.equals("sensors/engine_temperature"))
            {
                messagingTemplate.convertAndSend("/sensors/engine_temperature", sensorData);
            }
            if(topic.equals("sensors/tire_pressure"))
            {
                SensorDTO data = tirePressureService.saveSensorData(sensorData);
                messagingTemplate.convertAndSend("/sensors/tire_pressure", data);
            }
        };
    }
    // You can add any necessary logic to process the payload and create a DataMessage
    private SensorDTO processPayload(String sensor , String payload) {
        try {
            double value = Double.parseDouble(payload);
            return new SensorDTO(null, sensor, value, new Date());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid payload value: " + payload, e);
        }
    }


}