package upc.edu.pe.serviceinterface;

import upc.edu.pe.entities.*;

import java.util.List;

public interface ISugerenciaService {
    public boolean insert(Sugerencia sugerencia);
    public void eliminar(int idSugerencia);
    boolean modificar(Sugerencia sugerencia);
    List<Sugerencia> list();
}

