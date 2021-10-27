package upc.edu.pe.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import upc.edu.pe.entities.*;
import upc.edu.pe.repository.*;
import upc.edu.pe.serviceinterface.*;

import java.util.List;

@Service
public class ICategoriaServiceImpl implements ICategoriaService {

    private final ICategoriaRepository categoriaRepository;

    @Autowired
    public ICategoriaServiceImpl(ICategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    @Transactional
    public boolean insert(Categoria categoria) {
        try {
            categoriaRepository.save(categoria);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    @Override
    @Transactional
    public void eliminar(int idCategoria) {
        categoriaRepository.deleteById(idCategoria);
    }

    @Override
    public boolean modificar(Categoria categoria) {
        boolean flag = false;
        try {
            categoriaRepository.save(categoria);
            flag = true;
        } catch (Exception ex) {
            System.out.println("Sucedio un roche...");
        }
        return flag;
    }

    @Override
    public List<Categoria> list() {
        return categoriaRepository.findAll();
    }
}
