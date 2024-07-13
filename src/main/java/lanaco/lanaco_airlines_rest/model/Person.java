package lanaco.lanaco_airlines_rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Table(name = "person", schema = "lanaco_airlines", catalog = "AirlinesLANACO")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","userrByIdPerson"})
public class Person {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_person", nullable = false)
    private Integer idPerson;
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
    @Basic
    @Column(name = "address", nullable = true, length = 50)
    private String address;
    @Basic
    @Column(name = "city", nullable = true, length = 50)
    private String city;
    @Basic
    @Column(name = "email", nullable = true, length = 50)
    private String email;


 }
