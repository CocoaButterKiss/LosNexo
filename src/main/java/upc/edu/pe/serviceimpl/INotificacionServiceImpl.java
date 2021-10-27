package upc.edu.pe.serviceimpl;

import upc.edu.pe.entities.Categoria;
import upc.edu.pe.entities.Notificacion;
import upc.edu.pe.serviceinterface.INotificacionService;

import java.util.List;

public class INotificacionServiceImpl implements INotificacionService {
    @Override
    public boolean insert(Notificacion notificacion) {
        return false;
    }

    @Override
    public void eliminar(int idNotificacion) {

    }

    @Override
    public boolean modificar(Categoria categoria) {
        return false;
    }

    @Override
    public List<Notificacion> list() {
        return null;
    }
}
