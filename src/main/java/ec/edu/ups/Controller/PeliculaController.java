package ec.edu.ups.Controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import ec.edu.ups.EN.CategoriaEN;
import ec.edu.ups.EN.PeliculaEN;
import ec.edu.ups.ON.PeliculaON;

@ManagedBean

public class PeliculaController {
	@Inject
	private PeliculaON pon;
	
	private PeliculaEN pelicula;
	private CategoriaEN categoria;
	private int id;
	private List<PeliculaEN> plist;
	boolean editing ;
	@Inject
	private FacesContext facesContext;
	
	@PostConstruct
	public void init() {
		pelicula = new PeliculaEN();
	//	plist = pon.listarPersonal();
	//	editing = false;
	}
	
	public void loadData() {
		if (id == 0)
			return;
		try {
			pelicula = pon.leer(id);
			editing = true;
		} catch (Exception e) {
			e.printStackTrace();
			FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "Error");
			facesContext.addMessage(null, m);
		}
	}

	public String guardar() {
		System.out.println("el------------------------------ "+ pelicula);
		//pon.guardar(pelicula);
		return null;
	}
	
	public String addCategoria() {
		pelicula.addCategoria(new CategoriaEN());
		return null;
	}
	
	public String eliminar(int id) {
		pon.eliminar(id);
		return null;
	}

	public String update(PeliculaEN pe) {
		pon.update(pe);
		return null;
	}

	public List<PeliculaEN>list(){
		return plist;
		
	}
	
	public String regresar() {
		return "ventana-inicio";
	}
	
	public PeliculaEN getPelicula() {
		return pelicula;
	}

	public void setPelicula(PeliculaEN pelicula) {
		this.pelicula = pelicula;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<PeliculaEN> getPlist() {
		return plist;
	}

	public void setPlist(List<PeliculaEN> plist) {
		this.plist = plist;
	}

	public boolean isEditing() {
		return editing;
	}

	public void setEditing(boolean editing) {
		this.editing = editing;
	}

	public CategoriaEN getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEN categoria) {
		this.categoria = categoria;
	}
	
		
}
