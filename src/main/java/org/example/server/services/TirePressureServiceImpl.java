package org.example.server.services;

import org.example.server.mappers.TirePressureMapper;
import org.example.server.models.TirePressure;
import org.example.server.repos.TirePressureRepo;
import org.springframework.stereotype.Service;


@Service
public class TirePressureServiceImpl extends SensorServiceImpl<TirePressure> {

    public TirePressureServiceImpl(TirePressureRepo tirePressureRepo, TirePressureMapper tirePressureMapper) {
        super(tirePressureRepo, tirePressureMapper);
    }
}
