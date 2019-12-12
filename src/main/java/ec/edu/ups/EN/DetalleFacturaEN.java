package ec.edu.ups.EN;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class DetalleFacturaEN {
	
	@Id
	@GeneratedValue
	private int codigoD;
	private int cantidad;
	private Double subtotal;
	private String descripcion;
	@OneToOne
	private PeliculaEN pelicula;
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
	public PeliculaEN getPelicula() {
		return pelicula;
	}
	public void setPelicula(PeliculaEN pelicula) {
		this.pelicula = pelicula;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	@Override
	public String toString() {
		return "DetalleFacturaEN [codigoD=" + codigoD + ", cantidad=" + cantidad + ", subtotal=" + subtotal
				+ ", descripcion=" + descripcion + ", pelicula=" + pelicula + "]";
	}
	
}
