package ec.edu.ups.EN;

import java.util.List;

public class DetalleFacturaEN {
	private int codigoD;
	private int cantidadD;
	private Double subtotalD;
	private String descripcionD;
	private List<PeliculaEN> peliculasList;
	public int getCodigoD() {
		return codigoD;
	}
	public void setCodigoD(int codigoD) {
		this.codigoD = codigoD;
	}
	public int getCantidadD() {
		return cantidadD;
	}
	public void setCantidadD(int cantidadD) {
		this.cantidadD = cantidadD;
	}
	public Double getSubtotalD() {
		return subtotalD;
	}
	public void setSubtotalD(Double subtotalD) {
		this.subtotalD = subtotalD;
	}
	public String getDescripcionD() {
		return descripcionD;
	}
	public void setDescripcionD(String descripcionD) {
		this.descripcionD = descripcionD;
	}
	public List<PeliculaEN> getPeliculasList() {
		return peliculasList;
	}
	public void setPeliculasList(List<PeliculaEN> peliculasList) {
		this.peliculasList = peliculasList;
	}
	@Override
	public String toString() {
		return "DetalleFacturaEN [codigoD=" + codigoD + ", cantidadD=" + cantidadD + ", subtotalD=" + subtotalD
				+ ", descripcionD=" + descripcionD + ", peliculasList=" + peliculasList + "]";
	}
	
	

}
