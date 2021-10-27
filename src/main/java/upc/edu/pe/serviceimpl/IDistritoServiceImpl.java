package upc.edu.pe.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import upc.edu.pe.entities.Distrito;
import upc.edu.pe.repository.ICategoriaRepository;
import upc.edu.pe.repository.IDistritoRepository;
import upc.edu.pe.serviceinterface.IDistritoService;

import java.util.List;

public class IDistritoServiceImpl implements IDistritoService {

    private final IDistritoRepository distritoRepository;


    @Autowired
    public IDistritoServiceImpl(IDistritoRepository distritoRepository) {
        this.distritoRepository = distritoRepository;
    }

    @Override
    public boolean insert(Distrito distrito) {
        try {
            distritoRepository.save(distrito);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @Override
    public List<Distrito> list() {
        return null;
    }

    @Override
    public void eliminar(int idDistrito) {
        distritoRepository.deleteById(idDistrito);

    }

    @Override
    public boolean modificar(Distrito distrito) {
        return false;
    }
}
