package upc.edu.pe.serviceinterface;
import upc.edu.pe.entities.*;
import java.util.List;
public interface IUsuarioService {
    public boolean insert(Usuario usuario);
    List<Usuario> list();
    public void eliminar(int idUsuario);
    boolean modificar(Usuario usuario);
}
