package org.example.server.repos;


import org.example.server.models.TirePressure;
import org.springframework.stereotype.Repository;

@Repository
public interface TirePressureRepo extends SensorRepo<TirePressure> {
}
