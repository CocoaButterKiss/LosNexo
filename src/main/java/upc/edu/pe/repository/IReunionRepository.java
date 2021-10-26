package upc.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import upc.edu.pe.entities.Reunion;

public interface IReunionRepository  extends JpaRepository<Reunion, Integer> {
    @Query("select count(l.nombreReu) from Reunion l where l.nombreReu=:name")
    public int buscarReunion(@Param("name") String nombre);
}
