package lanaco.lanaco_airlines_rest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
@Table(name = "supervisor", schema = "lanaco_airlines", catalog = "AirlinesLANACO")
public class Supervisor {
    @Id
    @Column(name = "id_person_person", nullable = false)
    private int id;
    @OneToOne
    @JoinColumn(name = "id_person_person", referencedColumnName = "id_person", nullable = false)
    private Person personByIdPersonPerson;

}
