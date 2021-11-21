package upc.edu.pe.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.entities.Reunion;
import upc.edu.pe.repository.INotificacionRepository;
import upc.edu.pe.repository.IReunionRepository;
import upc.edu.pe.serviceinterface.IReunionService;

import java.util.List;

@Service
public class IReunionServiceImpl implements IReunionService {

    private final IReunionRepository reunionRepository;


    @Autowired
    public IReunionServiceImpl(IReunionRepository reunionRepository) {
        this.reunionRepository = reunionRepository;
    }


    @Override
    public boolean insert(Reunion reunion) {
        try {
            reunionRepository.save(reunion);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @Override
    public void eliminar(int idReunion) {
        reunionRepository.deleteById(idReunion);

    }

    @Override
    public boolean modificar(Reunion reunion) {
        boolean flag = false;
        try {
            reunionRepository.save(reunion);
            flag = true;
        } catch (Exception ex) {
            System.out.println("Sucedio un roche...");
        }
        return flag;
    }

    @Override
    public List<Reunion> list() {
        return reunionRepository.findAll();
    }
}
