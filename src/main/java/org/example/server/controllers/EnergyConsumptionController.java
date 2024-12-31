package org.example.server.controllers;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.example.server.dto.SensorDTO;
import org.example.server.services.EnergyConsumptionServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/energy_consumption")
@RequiredArgsConstructor
@Tag(name = "Energy Consumption Sensor API")
public class EnergyConsumptionController {
    private final EnergyConsumptionServiceImpl energyConsumptionService;

    @GetMapping("")
    @Operation(summary = "get all energy consumptions")
    public List<SensorDTO> getEnergyConsumptions(){
        return energyConsumptionService.listAll();
    }
}
