package lanaco.lanaco_airlines_rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BuyTicketDTO {

    private Date dateOfBuying;
    private String username;
    private Integer numberOfSeats;
    private Boolean reservationStatus;
    private Integer flightId;


}
