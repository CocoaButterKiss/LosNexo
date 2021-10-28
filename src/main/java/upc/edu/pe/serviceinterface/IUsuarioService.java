package upc.edu.pe.serviceinterface;
import java.util.List;

import upc.edu.pe.entities.Usuario;
public interface IUsuarioService {
    public Integer insert(Usuario usuario);
    List<Usuario> list();
   
}
