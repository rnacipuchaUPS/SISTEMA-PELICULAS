package ec.edu.ups.ON;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.DAO.DetalleFacturaDAO;
import ec.edu.ups.EN.DetalleFacturaEN;

@Stateless
public class DetalleFacturaON {
	@Inject
	private DetalleFacturaDAO dao;


	public void guardar(DetalleFacturaEN men) {
		dao.guardar(men);
	}

	public List<DetalleFacturaEN> listaM() {
		return dao.lista();
	}
}
