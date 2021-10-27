package upc.edu.pe.serviceimpl;

import upc.edu.pe.entities.Suscripcion;
import upc.edu.pe.serviceinterface.ISuscripcionService;

import java.util.List;

public class ISuscripcionServiceImpl implements ISuscripcionService {
    @Override
    public boolean insert(Suscripcion suscripcion) {
        return false;
    }

    @Override
    public void eliminar(int idSuscripcion) {

    }

    @Override
    public boolean modificar(Suscripcion suscripcion) {
        return false;
    }

    @Override
    public List<Suscripcion> list() {
        return null;
    }
}
