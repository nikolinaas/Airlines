package lanaco.lanaco_airlines_rest.services.impl;

import lanaco.lanaco_airlines_rest.dao.DestinationDAO;
import lanaco.lanaco_airlines_rest.model.Destination;
import lanaco.lanaco_airlines_rest.services.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DestinationServiceImpl implements DestinationService {

    @Autowired
    private DestinationDAO destinationDAO;

    @Override
    public Destination getDestinationById(Integer id) {
        return destinationDAO.getDestinationByIdDestination(id);
    }
}
