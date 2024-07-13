package lanaco.lanaco_airlines_rest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
public class Administrator{
    @Id
    @Column(name = "id_person_person", nullable = false)
    private int idPersonPerson;
    @Basic
    @Column(name = "id_airline_airline", nullable = false)
    private int idAirlineAirline;
    @Basic
    @Column(name = "suspended", nullable = false)
    private boolean suspended;
    @OneToOne
    @JoinColumn(name = "id_person_person", referencedColumnName = "id_person", nullable = false)
    private Person personByIdPersonPerson;
    @ManyToOne
    @JoinColumn(name = "id_airline_airline", referencedColumnName = "id_airline", nullable = false, insertable=false, updatable=false)
    private Airline airlineByIdAirlineAirline;


}
