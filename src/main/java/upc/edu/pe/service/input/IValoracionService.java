package upc.edu.pe.service.input;

import upc.edu.pe.repository.entities.*;

import java.util.List;

public interface IValoracionService {
    boolean insert(Valoracion valoracion);

    List<Valoracion> list();

    void eliminar(Long id);

    boolean modificar(Valoracion valoracion);
}
