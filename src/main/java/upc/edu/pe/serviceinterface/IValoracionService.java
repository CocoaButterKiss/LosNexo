package upc.edu.pe.serviceinterface;

import upc.edu.pe.entities.*;

import java.util.List;

public interface IValoracionService {
    public boolean insert(Valoracion valoracion);

    List<Valoracion> list();
    public void eliminar(int idValoracion);
    boolean modificar(Valoracion valoracion);
}
