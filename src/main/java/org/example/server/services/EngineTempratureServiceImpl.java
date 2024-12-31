package org.example.server.services;

import org.example.server.mappers.EngineTempratureMapper;
import org.example.server.models.EngineTemprature;
import org.example.server.repos.EngineTempratureRepo;
import org.springframework.stereotype.Service;

@Service
public class EngineTempratureServiceImpl extends SensorServiceImpl<EngineTemprature> {

    public EngineTempratureServiceImpl(EngineTempratureRepo engineTempratureRepo, EngineTempratureMapper engineTempratureMapper) {
        super(engineTempratureRepo, engineTempratureMapper);
    }
}
