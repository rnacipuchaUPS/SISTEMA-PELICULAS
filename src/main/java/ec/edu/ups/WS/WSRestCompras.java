package ec.edu.ups.WS;

import javax.inject.Inject;
import javax.ws.rs.Path;

import ec.edu.ups.ON.MaestroFacturaON;
import ec.edu.ups.WSModelos.Factura;

@Path("/factura")
public class WSRestCompras {

	@Inject
	private MaestroFacturaON mon;
	
	private Respuesta guardar(Factura f) {
		Respuesta r =  new Respuesta();
		try {
			
		} catch (Exception e) {			
			r.setCodigo(99);
			r.setMensaje("Error al insertar");
		}
		return r;
	}
}
