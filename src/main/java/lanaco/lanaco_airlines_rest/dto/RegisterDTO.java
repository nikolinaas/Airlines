package lanaco.lanaco_airlines_rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDTO {

    private String firstName;
    private String lastName;
    private String uid;
    private String username;
    private String password;
    private String address;
    private String city;
    private String email;
    private String role;

}
