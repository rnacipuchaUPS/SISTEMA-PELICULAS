package ec.edu.ups.ON;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.DAO.DetalleFacturaDAO;
import ec.edu.DAO.MaestroFacturaDAO;
import ec.edu.ups.EN.DetalleFacturaEN;
import ec.edu.ups.EN.MaestroFacturaEN;
import ec.edu.ups.WSModelos.Factura;
@Stateless
public class MaestroFacturaON {

	@Inject 
	private MaestroFacturaDAO mao;
	
	public void guardar(Factura fac) {
		MaestroFacturaEN men = new MaestroFacturaEN();
		men.setDescuento(fac.getDescuento());
		men.setDireccion(fac.getDireccion());
		men.setFecha(fac.getFecha());
		men.setIdUsu(fac.getIdUsu());
		men.setIva(fac.getIva());
		men.setPrecioExtra(fac.getPrecioExtra());
		men.setSubtotal(fac.getSubtotal());
		men.setTotal(fac.getTotal());
		for (DetalleFacturaEN def : fac.getDetalleList()) {
			
			men.add(def);
		}
		mao.guardar(men);
	}
	
	public List<MaestroFacturaEN> listaM(){
		return mao.lista();
	}
	
	
}
