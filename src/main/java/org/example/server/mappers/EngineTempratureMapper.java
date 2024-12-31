package org.example.server.mappers;


import org.example.server.dto.SensorDTO;
import org.example.server.models.EngineTemprature;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EngineTempratureMapper extends SensorMapper<EngineTemprature> {
    EngineTempratureMapper Instance = Mappers.getMapper(EngineTempratureMapper.class);


    @Override
    EngineTemprature map(SensorDTO sensorData);

    @Override
    SensorDTO map(EngineTemprature sensor);

    List<SensorDTO> map(List<EngineTemprature> sensors);

}
