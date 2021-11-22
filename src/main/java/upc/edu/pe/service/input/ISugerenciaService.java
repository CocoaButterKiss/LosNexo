package upc.edu.pe.service.input;

import upc.edu.pe.repository.entities.*;

import java.util.List;

public interface ISugerenciaService {
    boolean insert(Sugerencia sugerencia);

    void eliminar(Long idSugerencia);

    boolean modificar(Sugerencia sugerencia);

    List<Sugerencia> list();
}

