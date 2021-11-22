package upc.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.repository.entities.Categoria;

@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria, Long> {

}
