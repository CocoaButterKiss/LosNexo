package upc.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import upc.edu.pe.repository.entities.Suscripcion;
import upc.edu.pe.repository.ISuscripcionRepository;
import upc.edu.pe.service.input.ISuscripcionService;

@Service
public class SuscripcionServiceImpl implements ISuscripcionService {

    @Autowired
    private ISuscripcionRepository sR;

    @Override
    public boolean insert(Suscripcion suscripcion) {
        Suscripcion objProduct = sR.save(suscripcion);
        if (objProduct == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public List<Suscripcion> list() {
        return sR.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Suscripcion listarId(Long idSuscripcion) {
        Optional<Suscripcion> op = sR.findById(idSuscripcion);
        return op.orElseGet(Suscripcion::new);
    }

}

