package upc.edu.pe.serviceinterface;

import upc.edu.pe.entities.*;

import java.util.List;

public interface ITipoNotificacionService {
    public boolean insert(TipoNotificacion tipoNotificacion);
    public void eliminar(int IDTN);
    boolean modificar(TipoNotificacion tipoNotificacion);
    List<TipoNotificacion> list();
}
