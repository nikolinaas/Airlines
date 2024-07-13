package lanaco.lanaco_airlines_rest.controller;

import lanaco.lanaco_airlines_rest.model.BuyTicket;
import lanaco.lanaco_airlines_rest.services.BuyTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/search")
public class SearchController {


    @Autowired
    private BuyTicketService buyTicketService;

    @GetMapping
    public ResponseEntity<Map<String, Object>> searchByUsername(@RequestParam String username, @RequestParam(defaultValue = "0") int page, @RequestParam int size){

        try {
            List<BuyTicket> tickets = new ArrayList<BuyTicket>();
            Pageable paging = PageRequest.of(page, size);

            Page<BuyTicket> pageTuts = buyTicketService.findByUsername(username,paging);
            tickets = pageTuts.getContent();

            Map<String, Object> response = new HashMap<>();
            response.put("reservations", tickets);
            response.put("currentPage", pageTuts.getNumber());
            response.put("totalItems", pageTuts.getTotalElements());
            response.put("totalPages", pageTuts.getTotalPages());

            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
