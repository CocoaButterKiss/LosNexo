package upc.edu.pe.serviceimpl;

import upc.edu.pe.entities.Usuario;
import upc.edu.pe.serviceinterface.IUsuarioService;

import java.util.List;

public class IUsuarioServiceImpl implements IUsuarioService {
    @Override
    public boolean insert(Usuario usuario) {
        return false;
    }

    @Override
    public List<Usuario> list() {
        return null;
    }

    @Override
    public void eliminar(int idUsuario) {

    }

    @Override
    public boolean modificar(Usuario usuario) {
        return false;
    }
}
