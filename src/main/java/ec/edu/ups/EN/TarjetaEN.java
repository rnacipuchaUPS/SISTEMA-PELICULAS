package ec.edu.ups.EN;

public class TarjetaEN {
	private int codigoT;
	private String numeroTargetaT;
	private String claveT;
	public int getCodigoT() {
		return codigoT;
	}
	public void setCodigoT(int codigoT) {
		this.codigoT = codigoT;
	}
	public String getNumeroTargetaT() {
		return numeroTargetaT;
	}
	public void setNumeroTargetaT(String numeroTargetaT) {
		this.numeroTargetaT = numeroTargetaT;
	}
	public String getClaveT() {
		return claveT;
	}
	public void setClaveT(String claveT) {
		this.claveT = claveT;
	}
	@Override
	public String toString() {
		return "TarjetaEN [codigoT=" + codigoT + ", numeroTargetaT=" + numeroTargetaT + ", claveT=" + claveT + "]";
	}
	
	

}
