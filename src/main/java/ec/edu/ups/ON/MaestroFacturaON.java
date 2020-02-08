package ec.edu.ups.ON;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.DAO.DetalleFacturaDAO;
import ec.edu.DAO.MaestroFacturaDAO;
import ec.edu.ups.EN.MaestroFacturaEN;
@Stateless
public class MaestroFacturaON {

	@Inject 
	private MaestroFacturaDAO mao;
	
	public void guardar(MaestroFacturaEN men) {
		mao.guardar(men);
	}
	
	public List<MaestroFacturaEN> listaM(){
		return mao.lista();
	}
}
