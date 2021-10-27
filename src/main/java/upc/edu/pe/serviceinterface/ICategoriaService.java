package upc.edu.pe.serviceinterface;
import upc.edu.pe.entities.*;
import java.util.List;
public interface ICategoriaService {
    public boolean insert(Categoria categoria);

    public void eliminar(int idCategoria);
    boolean modificar(Categoria categoria);
    List<Categoria> list();

}
