package upc.edu.pe.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.entities.Valoracion;
import upc.edu.pe.repository.IValoracionRepository;
import upc.edu.pe.serviceinterface.IValoracionService;

import java.util.List;

@Service
public class IValoracionServiceImpl implements IValoracionService {
    private final IValoracionRepository valoracionRepository;


    @Autowired
    public IValoracionServiceImpl(IValoracionRepository valoracionRepository) {
        this.valoracionRepository = valoracionRepository;
    }



    @Override
    public boolean insert(Valoracion valoracion) {
        try {
            valoracionRepository.save(valoracion);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @Override
    public List<Valoracion> list() {
        return valoracionRepository.findAll();
    }

    @Override
    public void eliminar(int idValoracion) {
        valoracionRepository.deleteById(idValoracion);

    }

    @Override
    public boolean modificar(Valoracion valoracion) {
        boolean flag = false;
        try {
            valoracionRepository.save(valoracion);
            flag = true;
        } catch (Exception ex) {
            System.out.println("Sucedio un roche...");
        }
        return flag;
    }
}
