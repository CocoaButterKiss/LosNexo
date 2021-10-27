package upc.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.entities.Suscripcion;

@Repository
public interface ISuscripcionRepository extends JpaRepository<Suscripcion, Integer> {
}