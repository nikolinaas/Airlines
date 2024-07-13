package lanaco.lanaco_airlines_rest.services;

import lanaco.lanaco_airlines_rest.dto.RegisterDTO;
import lanaco.lanaco_airlines_rest.model.Person;

public interface PersonService {

    public Person login(String username, String password);
    public Person register(RegisterDTO registerReq);

    public String getRole(Person p);

    public Person getPerson(Integer id);
}
