package org.example.server.services;


import lombok.RequiredArgsConstructor;
import org.example.server.dto.SensorDTO;
import org.example.server.mappers.SensorMapper;
import org.example.server.models.Sensor;
import org.example.server.repos.SensorRepo;

import java.util.List;

@RequiredArgsConstructor
public abstract class SensorServiceImpl<T extends Sensor> implements SensorService {

    private final SensorRepo<T> sensorRepo;
    private final SensorMapper<T> sensorMapper;

    @Override
    public SensorDTO saveSensorData(SensorDTO sensorData) {
        T sensorEntity = sensorMapper.map(sensorData);
        T savedSensorEntity = sensorRepo.save(sensorEntity);
        return sensorMapper.map(savedSensorEntity);
    }

    @Override
    public List<SensorDTO> listAll() {
        return sensorMapper.map(sensorRepo.findAll());
    }

}
