package org.example.server.services;

import org.example.server.mappers.EngineTemperatureMapper;
import org.example.server.models.EngineTemperature;
import org.example.server.repos.EngineTemperatureRepo;
import org.springframework.stereotype.Service;

@Service
public class EngineTemperatureServiceImpl extends SensorServiceImpl<EngineTemperature> {

    public EngineTemperatureServiceImpl(EngineTemperatureRepo engineTempratureRepo, EngineTemperatureMapper engineTempratureMapper) {
        super(engineTempratureRepo, engineTempratureMapper);
    }
}
