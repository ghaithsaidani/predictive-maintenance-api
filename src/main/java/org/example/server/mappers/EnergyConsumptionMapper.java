package org.example.server.mappers;


import org.example.server.dto.SensorDTO;
import org.example.server.models.EnergyConsumption;
import org.example.server.models.EngineTemprature;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EnergyConsumptionMapper extends SensorMapper<EnergyConsumption> {
    EnergyConsumptionMapper Instance = Mappers.getMapper(EnergyConsumptionMapper.class);


    @Override
    EnergyConsumption map(SensorDTO sensorData);

    @Override
    SensorDTO map(EnergyConsumption sensor);

    List<SensorDTO> map(List<EnergyConsumption> sensors);

}
