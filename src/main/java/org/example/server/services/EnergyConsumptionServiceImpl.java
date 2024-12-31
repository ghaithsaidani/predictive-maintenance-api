package org.example.server.services;

import org.example.server.mappers.EnergyConsumptionMapper;
import org.example.server.models.EnergyConsumption;
import org.example.server.repos.EnergyConsumptionRepo;
import org.springframework.stereotype.Service;

@Service
public class EnergyConsumptionServiceImpl extends SensorServiceImpl<EnergyConsumption> {

    public EnergyConsumptionServiceImpl(EnergyConsumptionRepo energyConsumptionRepo, EnergyConsumptionMapper energyConsumptionMapper) {
        super(energyConsumptionRepo, energyConsumptionMapper);
    }
}
