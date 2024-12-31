package org.example.server.repos;

import org.example.server.models.EngineTemperature;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineTemperatureRepo extends SensorRepo<EngineTemperature>{
}
