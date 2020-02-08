package ec.edu.ups.WS;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import ec.edu.ups.EN.PeliculaEN;
import ec.edu.ups.ON.PeliculaON;

@Path("Peliculas")
public class WSRestPelicula {

	@Inject
	private PeliculaON pon;
	
	@PUT
	@Path("/actualizarP")
	@Produces("application/json")
	@Consumes("application/json")
	public Respuesta actualizarPel(PeliculaEN p) {
		Respuesta r = new Respuesta();
		try {
			pon.update(p);
			r.setCodigo(0);
			r.setMensaje("Pelicula Actualizado");
		} catch (Exception e) {
			r.setCodigo(99);
			r.setMensaje("Error, no se actualizo.");
			e.printStackTrace();
		}
		return r;
		
	}
	
	@GET
	@Path("/leerP")
	@Produces("application/json")
	public PeliculaEN leerPe(@QueryParam("id") int id) {
		return pon.leer(id);
	}
	
	@GET
	@Path("/listarP")
	@Produces("application/json")
	public List<PeliculaEN> listarPe() {
		return pon.listarPersonal();
		
	}
}
