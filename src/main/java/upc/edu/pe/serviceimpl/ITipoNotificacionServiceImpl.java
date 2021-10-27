package upc.edu.pe.serviceimpl;

import upc.edu.pe.entities.TipoNotificacion;
import upc.edu.pe.serviceinterface.ITipoNotificacionService;

import java.util.List;

public class ITipoNotificacionServiceImpl implements ITipoNotificacionService {
    @Override
    public boolean insert(TipoNotificacion tipoNotificacion) {
        return false;
    }

    @Override
    public void eliminar(int IDTN) {

    }

    @Override
    public boolean modificar(TipoNotificacion tipoNotificacion) {
        return false;
    }

    @Override
    public List<TipoNotificacion> list() {
        return null;
    }
}
