package org.example.server.mappers;


import org.example.server.dto.SensorDTO;
import org.example.server.models.EngineTemperature;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EngineTemperatureMapper extends SensorMapper<EngineTemperature> {
    EngineTemperatureMapper Instance = Mappers.getMapper(EngineTemperatureMapper.class);


    @Override
    EngineTemperature map(SensorDTO sensorData);

    @Override
    SensorDTO map(EngineTemperature sensor);

    List<SensorDTO> map(List<EngineTemperature> sensors);

}
