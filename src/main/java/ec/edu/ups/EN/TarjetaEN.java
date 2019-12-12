package ec.edu.ups.EN;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TarjetaEN {
	@Id
	@GeneratedValue
	private int codigoT;
	private String numeroTargeta;
	private String clave;
	
	@ManyToOne
	@JoinColumn(name="codigo-Tar")
	//@JsonIgnore
	private UsuarioEN usuario;

	public int getCodigoT() {
		return codigoT;
	}

	public void setCodigoT(int codigoT) {
		this.codigoT = codigoT;
	}

	public String getNumeroTargeta() {
		return numeroTargeta;
	}

	public void setNumeroTargeta(String numeroTargeta) {
		this.numeroTargeta = numeroTargeta;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public UsuarioEN getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioEN usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "TarjetaEN [codigoT=" + codigoT + ", numeroTargeta=" + numeroTargeta + ", clave=" + clave + ", usuario="
				+ usuario + "]";
	}
	
	
}
