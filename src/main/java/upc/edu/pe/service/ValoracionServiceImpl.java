package upc.edu.pe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.repository.entities.Valoracion;
import upc.edu.pe.repository.IValoracionRepository;
import upc.edu.pe.service.input.IValoracionService;

import java.util.List;

@Service
public class ValoracionServiceImpl implements IValoracionService {
    private final IValoracionRepository valoracionRepository;


    @Autowired
    public ValoracionServiceImpl(IValoracionRepository valoracionRepository) {
        this.valoracionRepository = valoracionRepository;
    }


    @Override
    public boolean insert(Valoracion valoracion) {
        try {
            valoracionRepository.save(valoracion);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @Override
    public List<Valoracion> list() {
        return valoracionRepository.findAll();
    }

    @Override
    public void eliminar(Long id) {
        valoracionRepository.deleteById(id);

    }

    @Override
    public boolean modificar(Valoracion valoracion) {
        boolean flag = false;
        try {
            valoracionRepository.save(valoracion);
            flag = true;
        } catch (Exception ex) {
            System.out.println("Sucedio un roche...");
        }
        return flag;
    }
}
