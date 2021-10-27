package upc.edu.pe.serviceimpl;

import upc.edu.pe.entities.Categoria;
import upc.edu.pe.entities.Sugerencia;
import upc.edu.pe.serviceinterface.ISugerenciaService;

import java.util.List;

public class ISugerenciaServiceImpl implements ISugerenciaService {
    @Override
    public boolean insert(Sugerencia sugerencia) {
        return false;
    }

    @Override
    public void eliminar(int idCategoria) {

    }

    @Override
    public boolean modificar(Categoria categoria) {
        return false;
    }

    @Override
    public List<Sugerencia> list() {
        return null;
    }
}
