package upc.edu.pe.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import upc.edu.pe.entities.Usuario;
import upc.edu.pe.repository.INotificacionRepository;
import upc.edu.pe.repository.IUsuarioRepository;
import upc.edu.pe.serviceinterface.IUsuarioService;

import java.util.List;

public class IUsuarioServiceImpl implements IUsuarioService {

    private final IUsuarioRepository usuarioRepository;


    @Autowired
    public IUsuarioServiceImpl(IUsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    @Override
    public boolean insert(Usuario usuario) {
        try {
            usuarioRepository.save(usuario);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;    }

    @Override
    public List<Usuario> list() {
        return usuarioRepository.findAll();
    }

    @Override
    public void eliminar(int idUsuario) {
        usuarioRepository.deleteById(idUsuario);

    }

    @Override
    public boolean modificar(Usuario usuario) {
        boolean flag = false;
        try {
            usuarioRepository.save(usuario);
            flag = true;
        } catch (Exception ex) {
            System.out.println("Sucedio un roche...");
        }
        return flag;
    }
}
