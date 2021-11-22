package upc.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.repository.entities.Valoracion;

@Repository
public interface IValoracionRepository extends JpaRepository<Valoracion, Long> {
}
