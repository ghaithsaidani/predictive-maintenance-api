package org.example.server.config;

import org.example.server.mappers.TirePressureMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public TirePressureMapper tirePressureMapper() {
        return TirePressureMapper.Instance;
    }
}
