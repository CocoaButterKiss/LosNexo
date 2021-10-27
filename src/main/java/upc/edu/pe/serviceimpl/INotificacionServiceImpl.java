package upc.edu.pe.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import upc.edu.pe.entities.Notificacion;
import upc.edu.pe.repository.INotificacionRepository;
import upc.edu.pe.serviceinterface.INotificacionService;

import java.util.List;

public class INotificacionServiceImpl implements INotificacionService {

    private final INotificacionRepository notificacionRepository;


    @Autowired
    public INotificacionServiceImpl(INotificacionRepository notificacionRepository) {
        this.notificacionRepository = notificacionRepository;
    }


    @Override
    public boolean insert(Notificacion notificacion) {
        try {
            notificacionRepository.save(notificacion);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @Override
    public void eliminar(int idNotificacion) {
        notificacionRepository.deleteById(idNotificacion);

    }

    @Override
    public boolean modificar(Notificacion notificacion) {
        boolean flag = false;
        try {
            notificacionRepository.save(notificacion);
            flag = true;
        } catch (Exception ex) {
            System.out.println("Sucedio un roche...");
        }
        return flag;
    }

    @Override
    public List<Notificacion> list() {
        return notificacionRepository.findAll();
    }
}
