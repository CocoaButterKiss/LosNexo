package upc.edu.pe.serviceinterface;

import upc.edu.pe.entities.*;

import java.util.List;

public interface ISugerenciaService {
    public boolean insert(Sugerencia sugerencia);
    public void eliminar(int idCategoria);
    boolean modificar(Categoria categoria);
    List<Sugerencia> list();
}

