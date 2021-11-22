package upc.edu.pe.service.input;


import upc.edu.pe.repository.entities.Suscripcion;

import java.util.List;



public interface ISuscripcionService {
	boolean insert(Suscripcion suscripcion);

	List<Suscripcion> list();

	Suscripcion listarId(Long idSuscripcion);
}

