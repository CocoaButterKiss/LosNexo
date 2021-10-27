package upc.edu.pe.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import upc.edu.pe.entities.Categoria;
import upc.edu.pe.entities.Sugerencia;
import upc.edu.pe.repository.INotificacionRepository;
import upc.edu.pe.repository.ISugerenciaRepository;
import upc.edu.pe.serviceinterface.ISugerenciaService;

import java.util.List;

public class ISugerenciaServiceImpl implements ISugerenciaService {

    private final ISugerenciaRepository sugerenciaRepository;


    @Autowired
    public ISugerenciaServiceImpl(ISugerenciaRepository sugerenciaRepository) {
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
    public void eliminar(int idSugerencia) {
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
