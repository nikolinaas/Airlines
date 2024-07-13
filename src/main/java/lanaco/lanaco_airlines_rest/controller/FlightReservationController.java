package lanaco.lanaco_airlines_rest.controller;

import jakarta.persistence.Persistence;
import lanaco.lanaco_airlines_rest.dto.BuyTicketDTO;
import lanaco.lanaco_airlines_rest.model.BuyTicket;
import lanaco.lanaco_airlines_rest.model.Flight;
import lanaco.lanaco_airlines_rest.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/reservation")
public class FlightReservationController {

    @Autowired
    private FlightService flightService;

    @Autowired
    private BuyTicketService buyTicketService;

    @Autowired
    private PersonService personService;

    @Autowired
    private DestinationService destinationService;

    @Autowired
    private AirlineService airlineService;

    @PostMapping
    public ResponseEntity<String> reserveFlight(@RequestBody BuyTicketDTO buyTicketDTO){

        BuyTicket ticket = buyTicketService.reserve(buyTicketDTO);
        System.out.println(ticket);
        Flight flight = flightService.getFlightById(ticket.getFlightIdFlight());
        String print = "Let broj: " + flight.getNumberFlight() + " pod imenom: " + flight.getName() + "\n Na destinaciju: " + destinationService.getDestinationById(flight.getIdDestinationDestination()).getName() + "\n Aviokompanijom:  " + airlineService.getAirlineById(flight.getIdAirlineAirline()).getName() + "\n Rezervisani broj sjedista: " + ticket.getNumOfPersons() + "\n Cijena jedne karte: " + flight.getPrice() + " \n Ukupna cijena: " + ( flight.getPrice() * ticket.getNumOfPersons());

        if(ticket!=null){
          return new ResponseEntity<String>("Uspjesna rezervacija leta za korisnika : " + personService.getPerson(ticket.getUserIdPersonPerson()).getFirstname() + "\n " + print, HttpStatus.OK);
        }else {
            return new ResponseEntity<String>("Neuspjesna rezervacija", HttpStatus.BAD_REQUEST);

        }
    }

}
