package lanaco.lanaco_airlines_rest.services.impl;

import lanaco.lanaco_airlines_rest.dao.FlightDAO;
import lanaco.lanaco_airlines_rest.model.Flight;
import lanaco.lanaco_airlines_rest.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl implements FlightService {


    @Autowired
    private FlightDAO flightDAO;

    @Override
    public Flight getFlightById(Integer id) {
        return flightDAO.getFlightByIdFlight(id);
    }
}
