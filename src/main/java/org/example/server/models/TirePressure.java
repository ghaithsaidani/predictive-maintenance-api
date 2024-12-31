package org.example.server.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tire_pressures")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TirePressure extends Sensor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
