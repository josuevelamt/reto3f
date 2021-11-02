package tutoria.domingo.interfaces;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tutoria.domingo.modelo.Reservacion;

public interface InterfaceReservacion extends CrudRepository<Reservacion,Integer> {
    
    public List<Reservacion> findAllByStatus(String status);
    
    public List<Reservacion> findAllByStartDateAfterAndStartDateBefore(Date dateOne, Date dateTwo);

    @Query ("SELECT c.client, COUNT(c.client) from Reservacion AS c group by c.client order by COUNT(c.client)DESC")
    public List<Object[]> countTotalReservationsByClient();
    
    
}
