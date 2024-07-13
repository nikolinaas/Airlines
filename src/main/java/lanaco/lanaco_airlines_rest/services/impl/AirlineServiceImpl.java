package lanaco.lanaco_airlines_rest.services.impl;

import lanaco.lanaco_airlines_rest.dao.AirlineDAO;
import lanaco.lanaco_airlines_rest.model.Airline;
import lanaco.lanaco_airlines_rest.services.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirlineServiceImpl implements AirlineService {

    @Autowired
    private AirlineDAO airlineDAO;
    @Override
    public Airline getAirlineById(Integer id) {
        return airlineDAO.getAirlineByIdAirline(id);
    }
}
