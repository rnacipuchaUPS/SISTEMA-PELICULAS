package ec.edu.ups.EN;

import java.util.List;

public class PeliculaEN {
	
	private int codigoP;
	private String tituloP;
	private String descripcionP;
	private String categoriaP;
	private Double valorP;
	private int cantidadP;
	private List<CategoriaEN> categoriaList;
	
	public int getCodigoP() {
		return codigoP;
	}
	public void setCodigoP(int codigoP) {
		this.codigoP = codigoP;
	}
	public String getTituloP() {
		return tituloP;
	}
	public void setTituloP(String tituloP) {
		this.tituloP = tituloP;
	}
	public String getDescripcionP() {
		return descripcionP;
	}
	public void setDescripcionP(String descripcionP) {
		this.descripcionP = descripcionP;
	}
	public String getCategoriaP() {
		return categoriaP;
	}
	public void setCategoriaP(String categoriaP) {
		this.categoriaP = categoriaP;
	}
	public Double getValorP() {
		return valorP;
	}
	public void setValorP(Double valorP) {
		this.valorP = valorP;
	}
	public int getCantidadP() {
		return cantidadP;
	}
	public void setCantidadP(int cantidadP) {
		this.cantidadP = cantidadP;
	}
	public List<CategoriaEN> getCategoriaList() {
		return categoriaList;
	}
	public void setCategoriaList(List<CategoriaEN> categoriaList) {
		this.categoriaList = categoriaList;
	}
	@Override
	public String toString() {
		return "PeliculaEN [codigoP=" + codigoP + ", tituloP=" + tituloP + ", descripcionP=" + descripcionP
				+ ", categoriaP=" + categoriaP + ", valorP=" + valorP + ", cantidadP=" + cantidadP + ", categoriaList="
				+ categoriaList + "]";
	}

}
