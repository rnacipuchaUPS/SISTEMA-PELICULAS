package ec.edu.ups.EN;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class DetalleFacturaEN {
	
	@Id
	@GeneratedValue
	private int codigoD;
	private int cantidad;
	private Double subtotal;
	private String descripcion;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoD")
	private List<PeliculaEN> pelicula;
	public int getCodigoD() {
		return codigoD;
	}
	public void setCodigoD(int codigoD) {
		this.codigoD = codigoD;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public List<PeliculaEN> getPelicula() {
		return pelicula;
	}
	public void setPelicula(List<PeliculaEN> pelicula) {
		this.pelicula = pelicula;
	}
	@Override
	public String toString() {
		return "DetalleFacturaEN [codigoD=" + codigoD + ", cantidad=" + cantidad + ", subtotal=" + subtotal
				+ ", descripcion=" + descripcion + ", pelicula=" + pelicula + "]";
	}
	
}
