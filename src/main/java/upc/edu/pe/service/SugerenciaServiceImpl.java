package upc.edu.pe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.repository.entities.Sugerencia;
import upc.edu.pe.repository.ISugerenciaRepository;
import upc.edu.pe.service.input.ISugerenciaService;

import java.util.List;

@Service
public class SugerenciaServiceImpl implements ISugerenciaService {

    private final ISugerenciaRepository sugerenciaRepository;


    @Autowired
    public SugerenciaServiceImpl(ISugerenciaRepository sugerenciaRepository) {
        this.sugerenciaRepository = sugerenciaRepository;
    }


    @Override
    public boolean insert(Sugerencia sugerencia) {
        try {
            sugerenciaRepository.save(sugerencia);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @Override
    public void eliminar(Long idSugerencia) {
        sugerenciaRepository.deleteById(idSugerencia);

    }

    @Override
    public boolean modificar(Sugerencia sugerencia) {
        boolean flag = false;
        try {
            sugerenciaRepository.save(sugerencia);
            flag = true;
        } catch (Exception ex) {
            System.out.println("Sucedio un roche...");
        }
        return flag;
    }

    @Override
    public List<Sugerencia> list() {
        return sugerenciaRepository.findAll();
    }
}
