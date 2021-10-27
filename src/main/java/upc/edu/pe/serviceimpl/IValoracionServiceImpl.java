package upc.edu.pe.serviceimpl;

import upc.edu.pe.entities.Valoracion;
import upc.edu.pe.serviceinterface.IValoracionService;

import java.util.List;

public class IValoracionServiceImpl implements IValoracionService {
    @Override
    public boolean insert(Valoracion valoracion) {
        return false;
    }

    @Override
    public List<Valoracion> list() {
        return null;
    }

    @Override
    public void eliminar(int idValoracion) {

    }

    @Override
    public boolean modificar(Valoracion valoracion) {
        return false;
    }
}
