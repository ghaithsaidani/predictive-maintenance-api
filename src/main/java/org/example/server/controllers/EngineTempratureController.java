package org.example.server.controllers;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.example.server.dto.SensorDTO;
import org.example.server.services.EngineTemperatureServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/engine_temperature")
@RequiredArgsConstructor
@Tag(name = "Engine Temprature Sensor API")
public class EngineTempratureController {
    private final EngineTemperatureServiceImpl engineTempratureService;

    @GetMapping("")
    @Operation(summary = "get all engine tempratures")
    public List<SensorDTO> getEngineTempratures(){
        return engineTempratureService.listAll();
    }
}
