package org.example.server.repos;

import org.example.server.models.EngineTemprature;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineTempratureRepo extends SensorRepo<EngineTemprature>{
}
