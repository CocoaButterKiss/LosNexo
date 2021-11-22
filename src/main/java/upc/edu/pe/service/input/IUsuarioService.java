package upc.edu.pe.service.input;

import java.util.List;

import upc.edu.pe.repository.entities.Usuario;

public interface IUsuarioService {
    Integer insert(Usuario usuario);

    List<Usuario> list();

}
