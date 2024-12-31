package org.example.server.mappers;


import org.example.server.dto.SensorDTO;
import org.example.server.models.Sensor;
import org.mapstruct.factory.Mappers;

import java.util.List;


public interface SensorMapper<T extends Sensor>{
    SensorMapper Instance = Mappers.getMapper(SensorMapper.class);

    T map(SensorDTO sensorData);

    SensorDTO map(T sensor);

    List<SensorDTO> map(List<T> sensors);
}
