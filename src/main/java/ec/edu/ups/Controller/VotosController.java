package ec.edu.ups.Controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import ec.edu.ups.EN.UsuarioEN;
import ec.edu.ups.EN.VotoEN;
import ec.edu.ups.ON.UsuarioON;
import ec.edu.ups.ON.VotoON;

@ManagedBean
@ViewScoped
public class VotosController {

	@Inject
	private VotoON von;
	@Inject
	private UsuarioON uon;
	private List<UsuarioEN> listU;

	private VotoEN voto;
	private List<VotoEN> listV;

	@PostConstruct
	public void init() {
		voto = new VotoEN();
		listV = von.listaV();
	}

	public void listarTitulo(String titulo) {
		//listV = von.listaBusqueda(titulo);
	}
	public void listarSi() {
		listV = von.listaBusquedaSi();
	}
	public void listarNo() {
		listV = von.listaBusquedaNo();
	}

	public List<VotoEN> getListV() {
		return von.listaV();
	}

	public void setListV(List<VotoEN> listV) {
		this.listV = listV;
	}

	public List<UsuarioEN> getListU() {
		return listU;
	}

	public void setListU(List<UsuarioEN> listU) {
		this.listU = listU;
	}

	public VotoEN getVoto() {
		return voto;
	}

	public void setVoto(VotoEN voto) {
		this.voto = voto;
	}
    
	
}
