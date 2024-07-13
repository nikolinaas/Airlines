package lanaco.lanaco_airlines_rest.dao;

import lanaco.lanaco_airlines_rest.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightDAO extends JpaRepository<Flight,Integer> {

    public Flight getFlightByIdFlight(Integer id);
}
