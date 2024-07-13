package lanaco.lanaco_airlines_rest.dao;

import lanaco.lanaco_airlines_rest.model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationDAO extends JpaRepository<Destination, Integer> {

    public Destination getDestinationByIdDestination(Integer id);
}
