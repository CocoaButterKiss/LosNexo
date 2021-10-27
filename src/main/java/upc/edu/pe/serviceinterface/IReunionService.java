package upc.edu.pe.serviceinterface;

import upc.edu.pe.entities.*;

import java.util.List;

public interface IReunionService {
    public boolean insert(Reunion reunion);
    public void eliminar(int idReunion);
    boolean modificar(Reunion reunion);
    List<Reunion> list();
}

