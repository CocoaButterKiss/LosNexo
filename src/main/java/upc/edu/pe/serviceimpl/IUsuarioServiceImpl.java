package upc.edu.pe.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import upc.edu.pe.entities.Usuario;
import upc.edu.pe.repository.IUsuarioRepository;
import upc.edu.pe.serviceinterface.IUsuarioService;

@Service
public class IUsuarioServiceImpl implements IUsuarioService {

    private  IUsuarioRepository uR;

	@Autowired
	public IUsuarioServiceImpl(IUsuarioRepository uR) {
		this.uR = uR;
	}

    @Override
    public Integer insert(Usuario usuario) {
    	int rpta = uR.usuarioExiste(usuario.getNombreUsuario());
		if (rpta == 0) {
			uR.save(usuario);
		}
		return rpta;
		}


    @Override
	public List<Usuario> list() {
		// TODO Auto-generated method stub
		return uR.findAll();
	}

   
}
