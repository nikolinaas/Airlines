package lanaco.lanaco_airlines_rest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Objects;

@Entity
@Data
@Table(name = "buy_ticket", schema = "lanaco_airlines", catalog = "AirlinesLANACO")
public class BuyTicket {
    @Basic
    @Column(name = "user_id_person_person", nullable = false)
    private int userIdPersonPerson;
    @Basic
    @Column(name = "flight_id_flight", nullable = false)
    private int flightIdFlight;
    @Basic
    @Column(name = "date_of_buying", nullable = false)
    private Date dateOfBuying;
    @Basic
    @Column(name = "num_of_persons", nullable = false)
    private int numOfPersons;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
//    @ManyToOne
//    @JoinColumn(name = "user_id_person_person", referencedColumnName = "id_person_person", nullable = false,insertable=false, updatable=false)
//    private Userr userrByUserIdPersonPerson;
//    @ManyToOne
//    @JoinColumn(name = "flight_id_flight", referencedColumnName = "id_flight", nullable = false, insertable=false, updatable=false)
//    private Flight flightByFlightIdFlight;


}
