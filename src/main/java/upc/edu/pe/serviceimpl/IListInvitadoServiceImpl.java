package upc.edu.pe.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import upc.edu.pe.entities.ListInvitado;
import upc.edu.pe.repository.IDistritoRepository;
import upc.edu.pe.repository.IListinvitadoRepository;
import upc.edu.pe.serviceinterface.IListInvitadoService;

import java.util.List;

public class IListInvitadoServiceImpl implements IListInvitadoService {

    private final IListinvitadoRepository listinvitadoRepository;


    @Autowired
    public IListInvitadoServiceImpl(IListinvitadoRepository listinvitadoRepository) {
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
    public void eliminar(int IDLINV) {
        listinvitadoRepository.deleteById(IDLINV);

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
