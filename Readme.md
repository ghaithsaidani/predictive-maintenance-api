# Predictive Maintenance API

This repository contains the backend service for the Predictive Maintenance API, designed to monitor IoT-enabled vehicle sensors and predict maintenance needs before critical failures occur. The backend is implemented using Spring Boot.

## Features

- **Real-time Sensor Monitoring**: Collects and processes data from IoT sensors, including:
    - Engine Temperature
    - Tire Pressure
    - Fuel Flow
    - Energy Consumption
- **Predictive Analysis**: Utilizes data to forecast potential maintenance issues.
- **RESTful APIs**: Provides endpoints to interact with the sensor data.
- **Modular Architecture**: Organized into controllers, services, mappers, models, repositories, and configuration.
- **WebSocket Support**: Enables real-time updates for sensor data.
- **Swagger Documentation**: API endpoints are documented with Swagger.
- **MQTT Integration**: Supports MQTT protocol for IoT communication.

## Directory Structure

```
└── ghaithsaidani-predictive-maintenance-api/
    └── src/
        ├── main/
            ├── resources/
            │   └── application.yml
            └── java/
                └── org/
                    └── example/
                        └── server/
                            ├── controllers/
                            │   ├── EnergyConsumptionController.java
                            │   ├── EngineTempratureController.java
                            │   ├── TirePressureController.java
                            │   └── FuelFlowController.java
                            ├── mappers/
                            │   ├── EnergyConsumptionMapper.java
                            │   ├── FuelFlowMapper.java
                            │   ├── SensorMapper.java
                            │   ├── TirePressureMapper.java
                            │   └── EngineTemperatureMapper.java
                            ├── dto/
                            │   └── SensorDTO.java
                            ├── ServerApplication.java
                            ├── services/
                            │   ├── EnergyConsumptionServiceImpl.java
                            │   ├── SensorServiceImpl.java
                            │   ├── FuelFlowServiceImpl.java
                            │   ├── SensorService.java
                            │   ├── EngineTemperatureServiceImpl.java
                            │   └── TirePressureServiceImpl.java
                            ├── models/
                            │   ├── Sensor.java
                            │   ├── EngineTemperature.java
                            │   ├── TirePressure.java
                            │   ├── FuelFlow.java
                            │   └── EnergyConsumption.java
                            ├── config/
                            │   ├── WebSocketConfig.java
                            │   ├── SwaggerConfig.java
                            │   ├── MapperConfig.java
                            │   ├── WebConfig.java
                            │   └── MqttConfig.java
                            └── repos/
                                ├── FuelFlowRepo.java
                                ├── EngineTemperatureRepo.java
                                ├── TirePressureRepo.java
                                ├── EnergyConsumptionRepo.java
                                └── SensorRepo.java
```

## Getting Started

### Prerequisites

- Java 17 or later
- Maven 3.8+
- MQTT Broker (e.g., Mosquitto)

### Setup and Run

1. Clone the repository:

   ```bash
   git clone https://github.com/ghaithsaidani/predictive-maintenance-api.git
   cd predictive-maintenance-api
   ```

2. Build the project:

   ```bash
   mvn clean install
   ```

3. Configure the application properties in `src/main/resources/application.yml`.

4. Run the application:

   ```bash
   mvn spring-boot:run
   ```

### API Documentation

Access the Swagger UI at: `http://localhost:8080/swagger-ui.html`

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new feature branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -m 'Add feature'`).
4. Push to the branch (`git push origin feature-name`).
5. Create a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to open an issue if you have any questions or need further assistance!

