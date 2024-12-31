package org.example.server.dto;

import java.util.Date;

public record SensorDTO(
        Long id,
        String sensorType,
        double value,
        Date createdAt
) {
}
