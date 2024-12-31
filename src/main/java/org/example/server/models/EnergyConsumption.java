package org.example.server.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "energy_consumption")
public class EnergyConsumption extends Sensor{
}
