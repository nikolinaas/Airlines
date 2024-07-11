package lanaco.lanaco_airlines_rest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
public class Administrator {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

}
