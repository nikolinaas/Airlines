package lanaco.lanaco_airlines_rest.dao;

import lanaco.lanaco_airlines_rest.model.Userr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserrDAO extends JpaRepository<Userr,Integer> {
}
