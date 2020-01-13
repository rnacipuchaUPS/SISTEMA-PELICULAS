package ec.edu.ups.Controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import ec.edu.ups.EN.CategoriaEN;
import ec.edu.ups.EN.PeliculaEN;
import ec.edu.ups.ON.PeliculaON;

@ManagedBean
@ViewScoped

public class PeliculaController {
	@Inject
	private PeliculaON pon;
	
	private PeliculaEN pelicula;
	private CategoriaEN categoria;
	private int id;
	private List<PeliculaEN> plist;
	
	private List <CategoriaEN>clist;
	
	@PostConstruct
	public void init() {
		pelicula = new PeliculaEN();
	//	plist = pon.listarPersonal();
	//	editing = false;
	}
	
	public String keyUptitulo() {
		System.out.println("llega");
		return null;
	}

	public String guardar() {
		System.out.println("el------------------------------ "+ pelicula);
		pon.guardar(pelicula);
		init();
		return null;
	}
	
	public String addCategoria() {
		pelicula.addCategoria(categoria);
		categoria = new CategoriaEN();
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

	public CategoriaEN getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEN categoria) {
		this.categoria = categoria;
	}


	public List<CategoriaEN> getClist() {
		return clist;
	}


	public void setClist(List<CategoriaEN> clist) {
		this.clist = clist;
	}
	
		
}
