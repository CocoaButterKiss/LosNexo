package upc.edu.pe.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import upc.edu.pe.entities.TipoNotificacion;
import upc.edu.pe.repository.INotificacionRepository;
import upc.edu.pe.repository.ITiponotificacionRepository;
import upc.edu.pe.serviceinterface.ITipoNotificacionService;

import java.util.List;

public class ITipoNotificacionServiceImpl implements ITipoNotificacionService {
    private final ITiponotificacionRepository notificacionRepository;


    @Autowired
    public ITipoNotificacionServiceImpl(ITiponotificacionRepository notificacionRepository) {
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
    public void eliminar(int IDTN) {
        notificacionRepository.deleteById(IDTN);

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
