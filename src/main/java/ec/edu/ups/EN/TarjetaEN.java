package ec.edu.ups.EN;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class TarjetaEN {
	@Id
	@GeneratedValue
	private int codigoT;
	private String numeroTargeta;
	private String clave;
	
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

	@Override
	public String toString() {
		return "TarjetaEN [codigoT=" + codigoT + ", numeroTargeta=" + numeroTargeta + ", clave=" + clave + "]";
	}

		
	
}
