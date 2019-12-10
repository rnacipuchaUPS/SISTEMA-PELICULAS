package ec.edu.ups.EN;

import java.util.List;

public class VotoEN {
	private int codigoV;
	private int puntuacionV;
	private List<UsuarioEN> usuarioList;
	private List<PeliculaEN> peliculaList;
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
	public List<UsuarioEN> getUsuarioList() {
		return usuarioList;
	}
	public void setUsuarioList(List<UsuarioEN> usuarioList) {
		this.usuarioList = usuarioList;
	}
	public List<PeliculaEN> getPeliculaList() {
		return peliculaList;
	}
	public void setPeliculaList(List<PeliculaEN> peliculaList) {
		this.peliculaList = peliculaList;
	}
	@Override
	public String toString() {
		return "VotoEN [codigoV=" + codigoV + ", puntuacionV=" + puntuacionV + ", usuarioList=" + usuarioList
				+ ", peliculaList=" + peliculaList + "]";
	}
	
	
	

}
