package upc.edu.pe.service.input;

import upc.edu.pe.repository.entities.*;

import java.util.List;

public interface IReunionService {
    boolean insert(Reunion reunion);

    void eliminar(Long idReunion);

    boolean modificar(Reunion reunion);

    List<Reunion> list();
}

