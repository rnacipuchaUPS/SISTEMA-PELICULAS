package ec.edu.ups.Controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.edu.ups.EN.AdministradorEN;
import ec.edu.ups.ON.AdministradorON;

@ManagedBean
@ApplicationScoped
public class AdministradorController {

	@Inject
	private AdministradorON aon;
	private AdministradorEN admi = new AdministradorEN();
	private int id;
	private String usu;
	private String clave;
	private String mensaje;

	@PostConstruct
	public void init() {
		admi = new AdministradorEN();
	}
	public String guardar() {
		System.out.println(admi);
		if (!aon.guardar(admi)) {
			mensaje = "El administrador con ese nombre ya existe, cambie el nombre o el usuario.";
			return "";
		} else {
			admi = new AdministradorEN();
			return "InicioP1";
		}

	}

	public void limpiarMensaje() {
		init();
		mensaje = "";
	}

	public String eliminar() {
		aon.eliminar(id);
		return null;
	}

	public String update() {
		aon.update(admi);
		return null;
	}

	public String login() {
		System.out.println("llega " + usu + " - " + clave);
		admi = aon.login(usu, clave);
		if (admi != null) {
			System.out.println("entra");
			mensaje = "";
			return "InicioGen.xhtml";
		} else {
			mensaje = "El usuario o la contraseña están incorrectos";
			usu = "";
			clave = "";
			init();
			return null;
		}

	}

	public String getUsu() {
		return usu;
	}

	public void setUsu(String usu) {
		this.usu = usu;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public AdministradorEN getAdmi() {
		return admi;
	}

	public void setAdmi(AdministradorEN admi) {
		this.admi = admi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
