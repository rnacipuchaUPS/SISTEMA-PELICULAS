package ec.edu.ups.EN;

public class CategoriaEN {
	private int codigoC;
	private String descripcionC;
	public int getCodigoC() {
		return codigoC;
	}
	public void setCodigoC(int codigoC) {
		this.codigoC = codigoC;
	}
	public String getDescripcionC() {
		return descripcionC;
	}
	public void setDescripcionC(String descripcionC) {
		this.descripcionC = descripcionC;
	}
	@Override
	public String toString() {
		return "CategoriaEN [codigoC=" + codigoC + ", descripcionC=" + descripcionC + "]";
	}
	
}
