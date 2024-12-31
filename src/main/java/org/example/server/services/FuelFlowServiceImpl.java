package org.example.server.services;

import org.example.server.mappers.FuelFlowMapper;
import org.example.server.models.FuelFlow;
import org.example.server.repos.FuelFlowRepo;
import org.springframework.stereotype.Service;

@Service
public class FuelFlowServiceImpl extends SensorServiceImpl<FuelFlow> {

    public FuelFlowServiceImpl(FuelFlowRepo fuelFlowRepo, FuelFlowMapper fuelFlowMapper) {
        super(fuelFlowRepo, fuelFlowMapper);
    }
}
