package org.example.server.repos;


import org.example.server.models.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepo<T extends Sensor> extends JpaRepository<T, Long> {
}
