package upc.edu.pe.serviceinterface;

import upc.edu.pe.entities.*;

import java.util.List;

public interface IListInvitadoService {
    public boolean insert(ListInvitado listInvitado);

    List<ListInvitado> list();
    public void eliminar(int IDLINV);
    boolean modificar(ListInvitado listInvitado);
}

