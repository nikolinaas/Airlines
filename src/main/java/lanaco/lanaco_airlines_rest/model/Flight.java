package lanaco.lanaco_airlines_rest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Objects;

@Entity
@Data
public class Flight {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_flight", nullable = false)
    private int idFlight;
    @Basic
    @Column(name = "number_flight", nullable = false)
    private int numberFlight;
    @Basic
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Basic
    @Column(name = "date_flight", nullable = false)
    private Date dateFlight;
    @Basic
    @Column(name = "id_airline_airline", nullable = false)
    private int idAirlineAirline;
    @Basic
    @Column(name = "id_destination_destination", nullable = false)
    private int idDestinationDestination;
    @Basic
    @Column(name = "price", nullable = false, precision = 0)
    private double price;
    @Basic
    @Column(name = "is_active", nullable = false)
    private boolean isActive;
    @Basic
    @Column(name = "number_of_seats", nullable = false)
    private int numberOfSeats;
    @Basic
    @Column(name = "available_seats", nullable = false)
    private int availableSeats;


}
