package upc.edu.pe.service.input;

import upc.edu.pe.repository.entities.*;

import java.util.List;

public interface IDistritoService {
    boolean insert(Distrito distrito);

    List<Distrito> list();

    void eliminar(Long idDistrito);

    boolean modificar(Distrito distrito);
}

