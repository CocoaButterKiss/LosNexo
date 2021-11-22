package upc.edu.pe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.repository.entities.TipoNotificacion;
import upc.edu.pe.repository.ITipoNotificacionRepository;
import upc.edu.pe.service.input.ITipoNotificacionService;

import java.util.List;

@Service
public class TipoNotificacionServiceImpl implements ITipoNotificacionService {

    private final ITipoNotificacionRepository notificacionRepository;


    @Autowired
    public TipoNotificacionServiceImpl(ITipoNotificacionRepository notificacionRepository) {
        this.notificacionRepository = notificacionRepository;
    }


    @Override
    public boolean insert(TipoNotificacion tipoNotificacion) {
        try {
            notificacionRepository.save(tipoNotificacion);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @Override
    public void eliminar(Long id) {
        notificacionRepository.deleteById(id);
    }

    @Override
    public boolean modificar(TipoNotificacion tipoNotificacion) {
        boolean flag = false;
        try {
            notificacionRepository.save(tipoNotificacion);
            flag = true;
        } catch (Exception ex) {
            System.out.println("Sucedio un roche...");
        }
        return flag;
    }

    @Override
    public List<TipoNotificacion> list() {
        return notificacionRepository.findAll();

    }
}
