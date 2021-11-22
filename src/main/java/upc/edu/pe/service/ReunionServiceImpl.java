package upc.edu.pe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.repository.entities.Reunion;
import upc.edu.pe.repository.IReunionRepository;
import upc.edu.pe.service.input.IReunionService;

import java.util.List;

@Service
public class ReunionServiceImpl implements IReunionService {

    private final IReunionRepository reunionRepository;


    @Autowired
    public ReunionServiceImpl(IReunionRepository reunionRepository) {
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
    public void eliminar(Long idReunion) {
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
