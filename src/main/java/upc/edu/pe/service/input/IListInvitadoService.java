package upc.edu.pe.service.input;

import upc.edu.pe.repository.entities.*;

import java.util.List;

public interface IListInvitadoService {
    boolean insert(ListInvitado listInvitado);

    List<ListInvitado> list();

    void eliminar(Long id);

    boolean modificar(ListInvitado listInvitado);
}

