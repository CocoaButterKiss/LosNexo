package upc.edu.pe.service.input;

import upc.edu.pe.repository.entities.*;

import java.util.List;

public interface ITipoNotificacionService {
    boolean insert(TipoNotificacion tipoNotificacion);

    void eliminar(Long id);

    boolean modificar(TipoNotificacion tipoNotificacion);

    List<TipoNotificacion> list();
}
