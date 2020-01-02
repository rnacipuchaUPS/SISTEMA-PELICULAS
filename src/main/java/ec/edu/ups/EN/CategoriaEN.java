package ec.edu.ups.EN;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CategoriaEN {
	@Id
	@GeneratedValue
	private int codigoC;
	private String descripcion;
	
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
	@Override
	public String toString() {
		return "CategoriaEN [codigoC=" + codigoC + ", descripcion=" + descripcion + "]";
	}
	
	
}
