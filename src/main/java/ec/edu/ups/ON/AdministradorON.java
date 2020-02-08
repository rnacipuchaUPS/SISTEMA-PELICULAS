package ec.edu.ups.ON;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.DAO.AdministradorDAO;
import ec.edu.ups.EN.AdministradorEN;

@Stateless
public class AdministradorON {
	@Inject
	private AdministradorDAO adao;

	public boolean guardar(AdministradorEN u) {
		return adao.guardar(u);
	}

	public void eliminar(int id) {
		adao.eliminar(id);
	}

	public void update(AdministradorEN u) {
		adao.update(u);
	}

	public AdministradorEN login(String usuario, String clave) {
		return adao.login(usuario, clave);
	}
}
