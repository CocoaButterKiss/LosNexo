package upc.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import upc.edu.pe.entities.Categoria;

@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria, Integer> {
	@Query("select count(l.nombreCategoria) from Categoria l where l.nombreCategoria=:name")
	public int buscarCategoria(@Param("name") String nombre);
}
