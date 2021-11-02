package tutoria.domingo.interfaces;

import org.springframework.data.repository.CrudRepository;
import tutoria.domingo.modelo.Mensaje;

public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer>{
    
}
