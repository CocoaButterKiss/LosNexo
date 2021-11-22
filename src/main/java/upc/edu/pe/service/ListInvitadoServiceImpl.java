package upc.edu.pe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.repository.entities.ListInvitado;
import upc.edu.pe.repository.IListinvitadoRepository;
import upc.edu.pe.service.input.IListInvitadoService;

import java.util.List;

@Service
public class ListInvitadoServiceImpl implements IListInvitadoService {

    private final IListinvitadoRepository listinvitadoRepository;


    @Autowired
    public ListInvitadoServiceImpl(IListinvitadoRepository listinvitadoRepository) {
        this.listinvitadoRepository = listinvitadoRepository;
    }

    @Override
    public boolean insert(ListInvitado listInvitado) {
        try {
            listinvitadoRepository.save(listInvitado);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @Override
    public List<ListInvitado> list() {
        return listinvitadoRepository.findAll();
    }

    @Override
    public void eliminar(Long id) {
        listinvitadoRepository.deleteById(id);

    }

    @Override
    public boolean modificar(ListInvitado listInvitado) {
        boolean flag = false;
        try {
            listinvitadoRepository.save(listInvitado);
            flag = true;
        } catch (Exception ex) {
            System.out.println("Sucedio un roche...");
        }
        return flag;
    }
}
