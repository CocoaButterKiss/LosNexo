package upc.edu.pe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import upc.edu.pe.repository.entities.*;
import upc.edu.pe.repository.*;
import upc.edu.pe.service.input.*;

import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

    private final ICategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaServiceImpl(ICategoriaRepository categoriaRepository) {
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
    public void eliminar(Long idCategoria) {
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
