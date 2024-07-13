package lanaco.lanaco_airlines_rest.services.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lanaco.lanaco_airlines_rest.dao.AdministratorDAO;
import lanaco.lanaco_airlines_rest.dao.PersonDAO;
import lanaco.lanaco_airlines_rest.dao.SupervisorDAO;
import lanaco.lanaco_airlines_rest.dao.UserrDAO;
import lanaco.lanaco_airlines_rest.dto.RegisterDTO;
import lanaco.lanaco_airlines_rest.model.Administrator;
import lanaco.lanaco_airlines_rest.model.Person;
import lanaco.lanaco_airlines_rest.model.Supervisor;
import lanaco.lanaco_airlines_rest.model.Userr;
import lanaco.lanaco_airlines_rest.services.EmailService;
import lanaco.lanaco_airlines_rest.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {


    @Autowired
    private PersonDAO personDAO;

    @Autowired
    private UserrDAO userrDAO;
    @Autowired
    private SupervisorDAO supervisorDAO;
    @Autowired
    private AdministratorDAO administratorDAO;

    @Autowired
    private EmailService emailService;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Person login(String username, String password) {

        Person per = personDAO.getPersonByUsernameAndPassword(username, password);
        System.out.println(per);

        return per;

    }

    @Override
    public Person register(RegisterDTO registerReq) {


        Person person = new Person();
        person.setFirstname(registerReq.getFirstName());
        person.setLastname(registerReq.getLastName());
        person.setUid(registerReq.getUid());
        person.setUsername(registerReq.getUsername());
        person.setPassword(registerReq.getPassword());
        person.setAddress(registerReq.getAddress());
        person.setCity(registerReq.getCity());
        person.setEmail(registerReq.getEmail());
        person.setIdPerson(null);
        person =  personDAO.save(person);

        switch (registerReq.getRole()) {
            case "USER" -> {
                System.out.println("dodaje ga kao user"+person.getIdPerson());

                Userr user = new Userr();
                user.setIdPersonPerson(person.getIdPerson());
                user.setSuspended(false);
                user  =  userrDAO.save(user);
                System.out.println("dodaje ga kao user"+user.getIdPersonPerson());
               // person.setUserrByIdPerson(user);

//
                personDAO.save(person);
            } case "ADMIN" -> {
                Administrator admin = new Administrator();
                admin.setIdPersonPerson(person.getIdPerson());
                admin.setSuspended(false);
                administratorDAO.save(admin);
            }
            case "SUPERVISOR" -> {
                Supervisor supervisor = new Supervisor();
                supervisor.setIdPersonPerson(person.getIdPerson());
                supervisorDAO.save(supervisor);
            }
        }
        emailService.sendRegistrationEmail(registerReq.getUsername(), registerReq.getEmail());

        return person;
    }
}
