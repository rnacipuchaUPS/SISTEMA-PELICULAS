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

import ec.edu.ups.Controller.VotosController;
import ec.edu.ups.EN.UsuarioEN;
import ec.edu.ups.EN.VotoEN;
import ec.edu.ups.ON.PeliculaON;
import ec.edu.ups.ON.UsuarioON;
import ec.edu.ups.ON.VotoON;
import ec.edu.ups.WSModelos.VotoWS;

@Path("Votos")
public class WSRestVoto {
	@Inject
	private VotoON von;
	
	@Inject
	private PeliculaON pon;
	
	@Inject
	private UsuarioON uon;

	@POST
	@Path("/votarPU")
	@Produces("application/json")
	@Consumes("application/json")
	public Respuesta crearVot(VotoWS v) {
		Respuesta r = new Respuesta();
		try {
			von.guardarVoto(v);
			r.setCodigo(0);
			r.setMensaje("Voto Registrado");
		} catch (Exception e) {
			r.setCodigo(99);
			r.setMensaje("Error, no se guardo.");
			e.printStackTrace();
		}
		return r;
	}

	@PUT
	@Path("/actualizarU")
	@Produces("application/json")
	@Consumes("application/json")
	public Respuesta actualizarUsu(UsuarioEN u) {
		Respuesta r = new Respuesta();
		try {
			uon.update(u);
			r.setCodigo(0);
			r.setMensaje("Usuario Actualizado");
		} catch (Exception e) {
			r.setCodigo(99);
			r.setMensaje("Error, no se guardo.");
			e.printStackTrace();
		}
		return r;

	}

	@GET
	@Path("/leerU")
	@Produces("application/json")
	public UsuarioEN leerUsu(@QueryParam("id") int id) {
		return uon.leer(id);

	}

	@GET
	@Path("/leerU")
	@Produces("application/json")
	public List<UsuarioEN> leerUsu() {
		return uon.listarPersonal();

	}
}
