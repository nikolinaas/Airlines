package lanaco.lanaco_airlines_rest.controller;


import lanaco.lanaco_airlines_rest.dto.RegisterDTO;
import lanaco.lanaco_airlines_rest.model.Person;
import lanaco.lanaco_airlines_rest.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/register")
public class RegisterController {



    @Autowired
    private PersonService personService;

    @PostMapping()
    public Person register(@RequestBody RegisterDTO registerDTO){

        return personService.register(registerDTO);
    }

}
