package ec.edu.ups.Controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import ec.edu.ups.EN.TarjetaEN;
import ec.edu.ups.EN.UsuarioEN;
import ec.edu.ups.ON.UsuarioON;

@ManagedBean
@ViewScoped
public class UsuarioController {
	@Inject
	private UsuarioON uon;	
	private UsuarioEN usuario;
	private int id;
	private List<UsuarioEN> listUsu;
	private List<TarjetaEN> tarje;
	private TarjetaEN tarjeta;
	
	
	@PostConstruct
	public void init() {
		usuario = new UsuarioEN();
		listUsu = uon.listarPersonal();
	}
	
	public String guardar() {
		uon.guardar(usuario);
		return null;
	}
	
	public String eliminar(int id) {
		uon.eliminar(id);
		return null;
	}

	public String update(UsuarioEN usuen) {
		uon.update(usuen);
		return null;
	}
	public String regresar() {
		return "ventana-inicio";
	}
	
	public String addTarjeta() {
		usuario.addTarjeta(tarjeta);
		tarjeta = new TarjetaEN();
		return null;
	}
	
	//Getters y setters
	public UsuarioEN getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioEN usuario) {
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<UsuarioEN> getListUsu() {
		return listUsu;
	}

	public void setListUsu(List<UsuarioEN> listUsu) {
		this.listUsu = listUsu;
	}

	public List<TarjetaEN> getTarje() {
		return tarje;
	}

	public void setTarje(List<TarjetaEN> tarje) {
		this.tarje = tarje;
	}

	public TarjetaEN getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(TarjetaEN tarjeta) {
		this.tarjeta = tarjeta;
	}
	
	
}
