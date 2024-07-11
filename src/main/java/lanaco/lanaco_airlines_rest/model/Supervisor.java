package lanaco.lanaco_airlines_rest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
public class Supervisor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_person_person", nullable = false)
    private int idPersonPerson;
    @OneToOne
    @JoinColumn(name = "id_person_person", referencedColumnName = "id_person", nullable = false)
    private Person personByIdPersonPerson;

}
