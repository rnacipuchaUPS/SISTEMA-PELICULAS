package ec.edu.ups.Controller;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import ec.edu.ups.EN.AdministradorEN;
import ec.edu.ups.ON.AdministradorON;
@ManagedBean
@ViewScoped
public class AdministradorController {

	@Inject
	private AdministradorON aon;
	private AdministradorEN admi;
	private int id;
	private String usu;
	private String clave;

	@PostConstruct
	public void init() {
		admi = new AdministradorEN();
	}

	public String guardar() {
		aon.guardar(admi);
		return null;
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
		if(aon.login(usu, clave)) {
			return "Inicio";
		}
		return null;
	}
	
}
