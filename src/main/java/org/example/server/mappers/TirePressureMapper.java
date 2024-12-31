package org.example.server.mappers;


import org.example.server.dto.SensorDTO;
import org.example.server.models.TirePressure;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TirePressureMapper extends SensorMapper<TirePressure> {
    TirePressureMapper Instance = Mappers.getMapper(TirePressureMapper.class);
    @Override
    TirePressure map(SensorDTO sensorData);

    @Override
    SensorDTO map(TirePressure sensor);

    List<SensorDTO> map(List<TirePressure> sensors);

}
