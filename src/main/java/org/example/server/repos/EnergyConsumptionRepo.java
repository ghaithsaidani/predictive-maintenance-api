package org.example.server.repos;

import org.example.server.models.EnergyConsumption;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyConsumptionRepo extends SensorRepo<EnergyConsumption>{
}
