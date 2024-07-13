package lanaco.lanaco_airlines_rest.dao;

import lanaco.lanaco_airlines_rest.model.Airline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlineDAO extends JpaRepository<Airline,Integer> {

    public Airline getAirlineByIdAirline(Integer id);
}
