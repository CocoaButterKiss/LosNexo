package upc.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import upc.edu.pe.repository.entities.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query("select count(l.nombreUsuario) from Usuario l where l.nombreUsuario=:name")
    public Integer usuarioExiste(@Param("name") String nombre);

}
