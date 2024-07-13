package lanaco.lanaco_airlines_rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;

@Entity
@Data
@Table(name = "userr", schema = "lanaco_airlines", catalog = "AirlinesLANACO")

public class Userr {
    @Id
    @Column(name = "id_person_person", nullable = false)
    private Integer idPersonPerson;
    @Basic
    @Column(name = "suspended", nullable = false)
    private boolean suspended;
    @OneToMany(mappedBy = "userrByUserIdPersonPerson")
    private Collection<BuyTicket> buyTicketsByIdPersonPerson;
    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "id_person_person", referencedColumnName = "id_person", nullable = false, insertable=false, updatable=false)
    private Person personByIdPersonPerson;


}
