package ec.edu.ups.Controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import ec.edu.ups.EN.AdministradorEN;
import ec.edu.ups.ON.AdministradorON;
@ManagedBean
@SessionScoped
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
		return "InicioP1";
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
		System.out.println("llega "+ usu+" - "+ clave);
		//if(aon.login(usu, clave)!=null) {	
			System.out.println("entra");
			return "index.xhtml";
		//}else {
			//init();
			
		//}
			
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
	
	
}
