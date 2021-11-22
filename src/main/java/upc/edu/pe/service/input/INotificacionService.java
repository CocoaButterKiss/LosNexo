package upc.edu.pe.service.input;

import upc.edu.pe.repository.entities.*;

import java.util.List;

public interface INotificacionService {
    boolean insert(Notificacion notificacion);

    void eliminar(Long idNotificacion);

    boolean modificar(Notificacion notificacion);

    List<Notificacion> list();
}

