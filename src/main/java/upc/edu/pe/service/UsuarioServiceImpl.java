package upc.edu.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import upc.edu.pe.repository.entities.Usuario;
import upc.edu.pe.repository.IUsuarioRepository;
import upc.edu.pe.service.input.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    private  IUsuarioRepository uR;

	@Autowired
	public UsuarioServiceImpl(IUsuarioRepository uR) {
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
