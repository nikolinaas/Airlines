package lanaco.lanaco_airlines_rest.dao;

import lanaco.lanaco_airlines_rest.model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorDAO extends JpaRepository<Administrator,Integer> {
}
