package lanaco.lanaco_airlines_rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;

@Entity
@Data
@Table(name = "airline", schema = "lanaco_airlines", catalog = "AirlinesLANACO")
public class Airline {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_airline", nullable = false)
    private int idAirline;
    @Basic
    @Column(name = "name", nullable = false, length = 50)
    private String name;
//    @OneToMany(mappedBy = "airlineByIdAirlineAirline", fetch = FetchType.LAZY)
//    @JsonIgnore
//    private Collection<Administrator> administratorsByIdAirline;
    @OneToMany(mappedBy = "airlineByIdAirlineAirline")
    private Collection<Airplane> airplanesByIdAirline;
//    @OneToMany(mappedBy = "airlineByIdAirlineAirline")
//    private Collection<Flight> flightsByIdAirline;

}
