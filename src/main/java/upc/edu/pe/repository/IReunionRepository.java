package upc.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import upc.edu.pe.repository.entities.Reunion;

public interface IReunionRepository extends JpaRepository<Reunion, Long> {

    @Query("select count(r.nombre) from Reunion r where r.nombre=:name")
    Integer buscarReunion(@Param("name") String nombre);
}
