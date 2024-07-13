package lanaco.lanaco_airlines_rest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class Airline {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_airline", nullable = false)
    private int idAirline;
    @Basic
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @OneToMany(mappedBy = "airlineByIdAirlineAirline")
    private Collection<Administrator> administratorsByIdAirline;
    @OneToMany(mappedBy = "airlineByIdAirlineAirline")
    private Collection<Airplane> airplanesByIdAirline;
    @OneToMany(mappedBy = "airlineByIdAirlineAirline")
    private Collection<Flight> flightsByIdAirline;

}
