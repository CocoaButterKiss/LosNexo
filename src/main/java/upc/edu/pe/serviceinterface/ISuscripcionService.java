package upc.edu.pe.serviceinterface;

import upc.edu.pe.entities.Categoria;
import upc.edu.pe.entities.Suscripcion;

import java.util.List;

public interface ISuscripcionService {
    public boolean insert(Suscripcion suscripcion);
    public void eliminar(int idSuscripcion);
    boolean modificar(Suscripcion suscripcion);
    List<Suscripcion> list();
}

