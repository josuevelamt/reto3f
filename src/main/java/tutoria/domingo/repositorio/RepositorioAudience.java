package tutoria.domingo.repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tutoria.domingo.interfaces.InterfaceAudience;
import tutoria.domingo.modelo.Audience;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositorioAudience {
    @Autowired
    private InterfaceAudience crud;


    public List<Audience> getAll(){
        return (List<Audience>) crud.findAll();
    }

    public Optional <Audience> getAudience(int id){
        return crud.findById(id);
    }

    public Audience save(Audience audience){
        return crud.save(audience);
    }
    public void delete(Audience audience){
        crud.delete(audience);
    }


}

