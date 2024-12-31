package org.example.server.controllers;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.example.server.dto.SensorDTO;
import org.example.server.services.TirePressureServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tire_pressure")
@RequiredArgsConstructor
@Tag(name = "Tire Pressure Sensor API")
public class TirePressureController {
    private final TirePressureServiceImpl tirePressureService;

    @GetMapping("")
    @Operation(summary = "get all tire pressures")
    public List<SensorDTO> getTirePressures(){
        return tirePressureService.listAll();
    }
}
