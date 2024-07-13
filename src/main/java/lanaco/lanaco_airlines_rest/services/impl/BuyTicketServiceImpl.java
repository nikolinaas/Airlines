package lanaco.lanaco_airlines_rest.services.impl;

import lanaco.lanaco_airlines_rest.dao.BuyTicketDAO;
import lanaco.lanaco_airlines_rest.dao.FlightDAO;
import lanaco.lanaco_airlines_rest.dao.PersonDAO;
import lanaco.lanaco_airlines_rest.dto.BuyTicketDTO;
import lanaco.lanaco_airlines_rest.model.BuyTicket;
import lanaco.lanaco_airlines_rest.model.Person;
import lanaco.lanaco_airlines_rest.services.BuyTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class BuyTicketServiceImpl implements BuyTicketService {


    @Autowired
    private BuyTicketDAO buyTicketDAO;


    @Autowired
    private FlightDAO flightDAO;

    @Autowired
    private PersonDAO personDAO;

    @Override
    public BuyTicket reserve(BuyTicketDTO buyTicketDTO) {

        BuyTicket ticket = new BuyTicket();
        ticket.setDateOfBuying(buyTicketDTO.getDateOfBuying());
        if (flightDAO.existsById(buyTicketDTO.getFlightId())) {
            ticket.setFlightIdFlight(buyTicketDTO.getFlightId());
        } else {
            return null;
        }
        if (personDAO.existsByUsername(buyTicketDTO.getUsername())) {
            ticket.setUserIdPersonPerson(personDAO.getPersonByUsername(buyTicketDTO.getUsername()).getIdPerson());
        } else {
            return null;
        }

        ticket.setNumOfPersons(buyTicketDTO.getNumberOfSeats());

        ticket = buyTicketDAO.save(ticket);

        return ticket;
    }

    @Override
    public Page<BuyTicket> findByUsername(String username, Pageable pageable) {

        Person p = personDAO.getPersonByUsername(username);

        return buyTicketDAO.findByUserIdPersonPerson(p.getIdPerson(), pageable);


    }
}
