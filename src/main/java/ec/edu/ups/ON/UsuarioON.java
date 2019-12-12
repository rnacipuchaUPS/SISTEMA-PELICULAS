package ec.edu.ups.ON;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.DAO.TarjetaDAO;
import ec.edu.DAO.UsuarioDAO;
import ec.edu.ups.EN.PeliculaEN;
import ec.edu.ups.EN.UsuarioEN;

@Stateless

public class UsuarioON {

	@Inject
	private UsuarioDAO udao;
	@Inject 
	private TarjetaDAO tdao;
	
	public void guardar(UsuarioEN u) {
		udao.guardar(u);
	}
	
	public void eliminar(int id) {
		udao.eliminar(id);
	}
	
	public void update(UsuarioEN u) {
		udao.update(u);
	}
	
	public List<UsuarioEN> listarPersonal() {
		return udao.listarPersonal();
	}
	
	public UsuarioEN leer(int id) {
		return udao.leer(id);
	}
	
}
