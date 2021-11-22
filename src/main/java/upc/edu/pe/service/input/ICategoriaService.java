package upc.edu.pe.service.input;

import upc.edu.pe.repository.entities.*;

import java.util.List;

public interface ICategoriaService {
    boolean insert(Categoria categoria);

    void eliminar(Long idCategoria);

    boolean modificar(Categoria categoria);

    List<Categoria> list();

}
