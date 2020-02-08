package ec.edu.ups.ON;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.DAO.CategoriaDAO;
import ec.edu.DAO.PeliculaDAO;
import ec.edu.ups.EN.PeliculaEN;
@Stateless
public class PeliculaON {

	@Inject
	private PeliculaDAO pdao;
	@Inject 
	private CategoriaDAO cdao;
	
	public void guardar(PeliculaEN u) {
		pdao.guardar(u);
	}
	public void eliminar(int id) {
		pdao.eliminar(id);
	}
	
	public void update(PeliculaEN u) {		
		pdao.update(u);
	}
	
	public List<PeliculaEN> listarPersonal() {
		return pdao.listarPersonal();
	}
	
	public PeliculaEN leer(int id) {
		return pdao.leer(id);
	}
	
}
