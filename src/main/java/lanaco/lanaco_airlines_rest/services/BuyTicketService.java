package lanaco.lanaco_airlines_rest.services;

import lanaco.lanaco_airlines_rest.dto.BuyTicketDTO;
import lanaco.lanaco_airlines_rest.model.BuyTicket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BuyTicketService {

    public BuyTicket reserve(BuyTicketDTO buyTicketDTO);
    public Page<BuyTicket> findByUsername(String username, Pageable pageable);

}
