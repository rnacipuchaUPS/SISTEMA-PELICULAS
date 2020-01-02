package ec.edu.ups.WS;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ec.edu.ups.EN.PeliculaEN;
import ec.edu.ups.ON.PeliculaON;

@Path("peliculas")
public class RestfulWs {

	@Inject
	private PeliculaON pon;

	@GET
	@Path("getPel")
	@Produces("application/json")
	public List<PeliculaEN> getPelicula() {
		return pon.listarPersonal();
	}

	@POST
	@Path("postPel")
	@Produces("application/json")
	@Consumes("application/json")
	public Respuesta guardarPelicula(PeliculaEN p) {
		Respuesta res = new Respuesta();
		try {
			pon.guardar(p);
			res.setCodigo(0);
			res.setMensaje("OK");
		} catch (Exception e) {
			res.setCodigo(99);
			res.setMensaje("Error al guardar la pelicula");
		}

		return res;
	}

}
