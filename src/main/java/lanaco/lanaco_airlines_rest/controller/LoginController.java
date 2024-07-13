package lanaco.lanaco_airlines_rest.controller;


import lanaco.lanaco_airlines_rest.dto.LoginDTO;
import lanaco.lanaco_airlines_rest.model.Person;
import lanaco.lanaco_airlines_rest.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/login")
public class LoginController {


    @Autowired
    private PersonService personService;
    @PostMapping()
    public Person login(@RequestBody LoginDTO loginReq){

        System.out.println(loginReq.getUsername());

       return personService.login(loginReq.getUsername(),loginReq.getPassword());


    }


}
