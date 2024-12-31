package org.example.server.services;

import org.example.server.dto.SensorDTO;

import java.util.List;

public interface SensorService<T> {
    SensorDTO saveSensorData(SensorDTO sensorData);
    List<SensorDTO> listAll();
}
