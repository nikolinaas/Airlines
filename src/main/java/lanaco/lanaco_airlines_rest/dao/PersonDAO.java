package lanaco.lanaco_airlines_rest.dao;

import lanaco.lanaco_airlines_rest.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDAO extends JpaRepository<Person,Integer> {

    public Person getPersonByUsernameAndPassword(String username, String password);

}
