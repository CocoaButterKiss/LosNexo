package upc.edu.pe.serviceinterface;

import upc.edu.pe.entities.*;

import java.util.List;

public interface IDistritoService {
    public boolean insert(Distrito distrito);

    List<Distrito> list();
    public void eliminar(int idDistrito);
    boolean modificar(Distrito distrito);
}

