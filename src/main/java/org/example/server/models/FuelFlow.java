package org.example.server.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "fuel_flows")
public class FuelFlow extends Sensor{
}
