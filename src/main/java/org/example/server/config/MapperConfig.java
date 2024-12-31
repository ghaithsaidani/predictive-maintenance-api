package org.example.server.config;

import org.example.server.mappers.EnergyConsumptionMapper;
import org.example.server.mappers.EngineTemperatureMapper;
import org.example.server.mappers.FuelFlowMapper;
import org.example.server.mappers.TirePressureMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public TirePressureMapper tirePressureMapper() {
        return TirePressureMapper.Instance;
    }

    @Bean
    public EngineTemperatureMapper EngineTempratureMapper() {
        return EngineTemperatureMapper.Instance;
    }

    @Bean
    public EnergyConsumptionMapper EnergyConsumptionMapper() {
        return EnergyConsumptionMapper.Instance;
    }

    @Bean
    public FuelFlowMapper FuelFlowMapper() {
        return FuelFlowMapper.Instance;
    }
}
