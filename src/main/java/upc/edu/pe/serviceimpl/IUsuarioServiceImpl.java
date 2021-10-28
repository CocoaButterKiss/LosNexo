package upc.edu.pe.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import upc.edu.pe.entities.Usuario;
import upc.edu.pe.repository.IUsuarioRepository;
import upc.edu.pe.serviceinterface.IUsuarioService;

public class IUsuarioServiceImpl implements IUsuarioService {

	@Autowired
    private  IUsuarioRepository uR;


    @Override
    public Integer insert(Usuario usuario) {
    	int rpta = uR.usuariosExistentes(usuario.getNombreUsuario());
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
