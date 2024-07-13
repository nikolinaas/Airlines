package lanaco.lanaco_airlines_rest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;

@Entity
@Data
public class Destination {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_destination", nullable = false)
    private int idDestination;
    @Basic
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    @Basic
    @Column(name = "location", nullable = false, length = 100)
    private String location;
    @Basic
    @Column(name = "is_active", nullable = false)
    private boolean isActive;
    @OneToMany(mappedBy = "destinationByIdDestinationDestination")
    private Collection<Flight> flightsByIdDestination;


}
