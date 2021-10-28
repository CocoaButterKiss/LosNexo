package upc.edu.pe.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import upc.edu.pe.entities.Suscripcion;
import upc.edu.pe.repository.ISuscripcionRepository;
import upc.edu.pe.serviceinterface.ISuscripcionService;

@Service
public class ISuscripcionServiceImpl implements ISuscripcionService {

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
		// TODO Auto-generated method stub
		return sR.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Suscripcion listarId(int idSuscripcion) {
		Optional<Suscripcion> op = sR.findById(idSuscripcion);
		return op.isPresent() ? op.get() : new Suscripcion();
	}

}

