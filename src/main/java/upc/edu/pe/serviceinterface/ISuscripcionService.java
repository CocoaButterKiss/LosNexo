package upc.edu.pe.serviceinterface;


import upc.edu.pe.entities.Suscripcion;

import java.util.List;



public interface ISuscripcionService {
	public boolean insert(Suscripcion suscripcion);

	List<Suscripcion> list();

	Suscripcion listarId(int idSuscripcion);
}

