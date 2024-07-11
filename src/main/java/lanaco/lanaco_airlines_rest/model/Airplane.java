package lanaco.lanaco_airlines_rest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
public class Airplane {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_airplane", nullable = false)
    private int idAirplane;
    @Basic
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Basic
    @Column(name = "id_airline_airline", nullable = false)
    private int idAirlineAirline;
    @Basic
    @Column(name = "is_active", nullable = false)
    private boolean isActive;
    @Basic
    @Column(name = "seats", nullable = false)
    private int seats;
    @Basic
    @Column(name = "brand", nullable = false, length = 50)
    private String brand;
    @ManyToOne
    @JoinColumn(name = "id_airline_airline", referencedColumnName = "id_airline", nullable = false)
    private Airline airlineByIdAirlineAirline;

}
