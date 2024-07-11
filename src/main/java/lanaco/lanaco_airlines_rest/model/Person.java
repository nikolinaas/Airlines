package lanaco.lanaco_airlines_rest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
public class Person {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_person", nullable = false)
    private int idPerson;
    @Basic
    @Column(name = "firstname", nullable = false, length = 50)
    private String firstname;
    @Basic
    @Column(name = "lastname", nullable = false, length = 50)
    private String lastname;
    @Basic
    @Column(name = "uid", nullable = false, length = 13)
    private String uid;
    @Basic
    @Column(name = "username", nullable = false, length = 50)
    private String username;
    @Basic
    @Column(name = "password", nullable = false, length = 50)
    private String password;
    @OneToOne(mappedBy = "personByIdPersonPerson")
    private Administrator administratorByIdPerson;
    @OneToOne(mappedBy = "personByIdPersonPerson")
    private Supervisor supervisorByIdPerson;
    @OneToOne(mappedBy = "personByIdPersonPerson")
    private User userByIdPerson;

}
