package ec.edu.ups.EN;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class VotoEN {
	@Id
	@GeneratedValue
	private int codigoV;
	private int puntuacionV;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoV")
	private UsuarioEN usuario;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoV")
	private PeliculaEN pelicula;
	public int getCodigoV() {
		return codigoV;
	}
	public void setCodigoV(int codigoV) {
		this.codigoV = codigoV;
	}
	public int getPuntuacionV() {
		return puntuacionV;
	}
	public void setPuntuacionV(int puntuacionV) {
		this.puntuacionV = puntuacionV;
	}
	public UsuarioEN getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioEN usuario) {
		this.usuario = usuario;
	}
	public PeliculaEN getPelicula() {
		return pelicula;
	}
	public void setPelicula(PeliculaEN pelicula) {
		this.pelicula = pelicula;
	}
	@Override
	public String toString() {
		return "VotoEN [codigoV=" + codigoV + ", puntuacionV=" + puntuacionV + ", usuario=" + usuario + ", pelicula="
				+ pelicula + "]";
	}
	
}
