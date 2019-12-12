package ec.edu.ups.EN;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CategoriaEN {
	@Id
	@GeneratedValue
	private int codigoC;
	private String descripcion;
	@ManyToOne
	@JoinColumn(name="codigo-Cate")
	//@JsonIgnore
	private PeliculaEN pelicula;
	
	public int getCodigoC() {
		return codigoC;
	}
	public void setCodigoC(int codigoC) {
		this.codigoC = codigoC;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public PeliculaEN getPelicula() {
		return pelicula;
	}
	public void setPelicula(PeliculaEN pelicula) {
		this.pelicula = pelicula;
	}
	@Override
	public String toString() {
		return "CategoriaEN [codigoC=" + codigoC + ", descripcion=" + descripcion + ", pelicula=" + pelicula + "]";
	}
	
	
}
