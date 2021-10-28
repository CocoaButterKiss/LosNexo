package upc.edu.pe.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import upc.edu.pe.entities.Usuario;
import upc.edu.pe.repository.IUsuarioRepository;
import upc.edu.pe.serviceinterface.IUsuarioService;

public class IUsuarioServiceImpl implements IUsuarioService {

    private  IUsuarioRepository uR;

	@Autowired
	public IUsuarioServiceImpl(IUsuarioRepository uR) {
		this.uR = uR;
	}

    @Override
    public boolean insert(Usuario usuario) {
		try {
			uR.save(usuario);
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
		}
    

    @Override
	public List<Usuario> list() {
		// TODO Auto-generated method stub
		return uR.findAll();
	}

   
}
