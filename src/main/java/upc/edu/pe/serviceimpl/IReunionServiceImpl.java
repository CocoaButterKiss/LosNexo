package upc.edu.pe.serviceimpl;

import upc.edu.pe.entities.Reunion;
import upc.edu.pe.serviceinterface.IReunionService;

import java.util.List;

public class IReunionServiceImpl implements IReunionService {
    @Override
    public boolean insert(Reunion reunion) {
        return false;
    }

    @Override
    public void eliminar(int idReunion) {

    }

    @Override
    public boolean modificar(Reunion reunion) {
        return false;
    }

    @Override
    public List<Reunion> list() {
        return null;
    }
}
