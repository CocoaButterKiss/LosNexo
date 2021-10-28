package upc.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import upc.edu.pe.entities.Suscripcion;

@Repository
public interface ISuscripcionRepository extends JpaRepository<Suscripcion, Integer> {
	@Query("select count(l.) from Suscripcion l where l.usuario=:name")
	public int buscarSuscripcion(@Param("name") String nombre);
	
}
