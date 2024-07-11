package lanaco.lanaco_airlines_rest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
@Data
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_person_person", nullable = false)
    private int idPersonPerson;
    @Basic
    @Column(name = "suspended", nullable = false)
    private boolean suspended;
    @OneToMany(mappedBy = "userByUserIdPersonPerson")
    private List<BuyTicket> buyTicketsByIdPersonPerson;
    @OneToOne
    @JoinColumn(name = "id_person_person", referencedColumnName = "id_person", nullable = false)
    private Person personByIdPersonPerson;

}
