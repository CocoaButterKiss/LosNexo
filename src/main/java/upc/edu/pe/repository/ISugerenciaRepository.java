package upc.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import upc.edu.pe.entities.Reunion;
import upc.edu.pe.entities.Sugerencia;

public interface ISugerenciaRepository  extends JpaRepository<Sugerencia, Integer> {

}
