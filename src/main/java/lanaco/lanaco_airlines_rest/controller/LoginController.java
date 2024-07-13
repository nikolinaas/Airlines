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
    public ResponseEntity<String> login(@RequestBody LoginDTO loginReq){

        System.out.println(loginReq.getUsername());
        Person res = personService.login(loginReq.getUsername(),loginReq.getPassword());
       if(res!=null){

           return new ResponseEntity<String>("Ulogovali ste se kao: " + personService.getRole(res), HttpStatus.OK);

       }

return new ResponseEntity<String>("Neuspjesno logovanje, pokusajte ponovo", HttpStatus.BAD_REQUEST);
    }


}
