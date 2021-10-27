package upc.edu.pe.serviceinterface;

import upc.edu.pe.entities.*;

import java.util.List;

public interface INotificacionService {
    public boolean insert(Notificacion notificacion);
    public void eliminar(int idNotificacion);
    boolean modificar(Categoria categoria);
    List<Notificacion> list();
}

