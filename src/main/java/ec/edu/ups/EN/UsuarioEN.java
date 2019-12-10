package ec.edu.ups.EN;

import java.util.List;

public class UsuarioEN {
	private int codigoU;
	private String nombreU;
	private String apellidoU;
	private String generoU;
	private List<TarjetaEN> targetaList;
	public int getCodigoU() {
		return codigoU;
	}
	public void setCodigoU(int codigoU) {
		this.codigoU = codigoU;
	}
	public String getNombreU() {
		return nombreU;
	}
	public void setNombreU(String nombreU) {
		this.nombreU = nombreU;
	}
	public String getApellidoU() {
		return apellidoU;
	}
	public void setApellidoU(String apellidoU) {
		this.apellidoU = apellidoU;
	}
	public String getGeneroU() {
		return generoU;
	}
	public void setGeneroU(String generoU) {
		this.generoU = generoU;
	}
	public List<TarjetaEN> getTargetaList() {
		return targetaList;
	}
	public void setTargetaList(List<TarjetaEN> targetaList) {
		this.targetaList = targetaList;
	}
	@Override
	public String toString() {
		return "UsuarioEN [codigoU=" + codigoU + ", nombreU=" + nombreU + ", apellidoU=" + apellidoU + ", generoU="
				+ generoU + ", targetaList=" + targetaList + "]";
	}
	
	
	
	
}
