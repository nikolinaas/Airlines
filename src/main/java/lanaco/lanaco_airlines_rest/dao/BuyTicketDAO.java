package lanaco.lanaco_airlines_rest.dao;

import lanaco.lanaco_airlines_rest.model.BuyTicket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyTicketDAO extends JpaRepository<BuyTicket,Integer> {

  public  Page<BuyTicket> findByUserIdPersonPerson(Integer id, Pageable pageable);

}
