package org.example.server.controllers;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.example.server.dto.SensorDTO;
import org.example.server.services.EnergyConsumptionServiceImpl;
import org.example.server.services.FuelFlowServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/fuel_flow")
@RequiredArgsConstructor
@Tag(name = "Fuel Flow Sensor API")
public class FuelFlowController {
    private final FuelFlowServiceImpl fuelFlowServiceImpl;

    @GetMapping("")
    @Operation(summary = "get all fuel flow")
    public List<SensorDTO> getEnergyConsumptions(){
        return fuelFlowServiceImpl.listAll();
    }
}
