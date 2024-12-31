package org.example.server.mappers;


import org.example.server.dto.SensorDTO;
import org.example.server.models.EnergyConsumption;
import org.example.server.models.FuelFlow;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface FuelFlowMapper extends SensorMapper<FuelFlow> {
    FuelFlowMapper Instance = Mappers.getMapper(FuelFlowMapper.class);


    @Override
    FuelFlow map(SensorDTO sensorData);

    @Override
    SensorDTO map(FuelFlow sensor);

    List<SensorDTO> map(List<FuelFlow> sensors);

}
