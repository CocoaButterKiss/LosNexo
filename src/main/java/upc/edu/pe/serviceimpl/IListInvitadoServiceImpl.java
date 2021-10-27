package upc.edu.pe.serviceimpl;

import upc.edu.pe.entities.ListInvitado;
import upc.edu.pe.serviceinterface.IListInvitadoService;

import java.util.List;

public class IListInvitadoServiceImpl implements IListInvitadoService {
    @Override
    public boolean insert(ListInvitado listInvitado) {
        return false;
    }

    @Override
    public List<ListInvitado> list() {
        return null;
    }

    @Override
    public void eliminar(int IDLINV) {

    }

    @Override
    public boolean modificar(ListInvitado listInvitado) {
        return false;
    }
}
