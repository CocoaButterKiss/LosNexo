package upc.edu.pe.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import upc.edu.pe.entities.Suscripcion;
import upc.edu.pe.repository.INotificacionRepository;
import upc.edu.pe.repository.ISugerenciaRepository;
import upc.edu.pe.repository.ISuscripcionRepository;
import upc.edu.pe.serviceinterface.ISuscripcionService;

import java.util.List;

public class ISuscripcionServiceImpl implements ISuscripcionService {

    private final ISuscripcionRepository suscripcionRepository;


    @Autowired
    public ISuscripcionServiceImpl(ISuscripcionRepository suscripcionRepository) {
        this.suscripcionRepository = suscripcionRepository;
    }


    @Override
    public boolean insert(Suscripcion suscripcion) {
        try {
            suscripcionRepository.save(suscripcion);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @Override
    public void eliminar(int idSuscripcion) {
        suscripcionRepository.deleteById(idSuscripcion);

    }

    @Override
    public boolean modificar(Suscripcion suscripcion) {
        boolean flag = false;
        try {
            suscripcionRepository.save(suscripcion);
            flag = true;
        } catch (Exception ex) {
            System.out.println("Sucedio un roche...");
        }
        return flag;
    }

    @Override
    public List<Suscripcion> list() {
        return suscripcionRepository.findAll();
    }
}
