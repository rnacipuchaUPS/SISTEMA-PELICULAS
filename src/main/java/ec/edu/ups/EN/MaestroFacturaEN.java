package ec.edu.ups.EN;

import java.util.List;

public class MaestroFacturaEN {
	private int codigoM;
	private String fechaM;
	private String direccionM;
	private String subtotalM;
	private Double ivaM;
	private Double descuentoM;
	private Double totalM;
	private List<UsuarioEN> usuarioList;
	private List<DetalleFacturaEN> detalleList;
	public int getCodigoM() {
		return codigoM;
	}
	public void setCodigoM(int codigoM) {
		this.codigoM = codigoM;
	}
	public String getFechaM() {
		return fechaM;
	}
	public void setFechaM(String fechaM) {
		this.fechaM = fechaM;
	}
	public String getDireccionM() {
		return direccionM;
	}
	public void setDireccionM(String direccionM) {
		this.direccionM = direccionM;
	}
	public String getSubtotalM() {
		return subtotalM;
	}
	public void setSubtotalM(String subtotalM) {
		this.subtotalM = subtotalM;
	}
	public Double getIvaM() {
		return ivaM;
	}
	public void setIvaM(Double ivaM) {
		this.ivaM = ivaM;
	}
	public Double getDescuentoM() {
		return descuentoM;
	}
	public void setDescuentoM(Double descuentoM) {
		this.descuentoM = descuentoM;
	}
	public Double getTotalM() {
		return totalM;
	}
	public void setTotalM(Double totalM) {
		this.totalM = totalM;
	}
	public List<UsuarioEN> getUsuarioList() {
		return usuarioList;
	}
	public void setUsuarioList(List<UsuarioEN> usuarioList) {
		this.usuarioList = usuarioList;
	}
	public List<DetalleFacturaEN> getDetalleList() {
		return detalleList;
	}
	public void setDetalleList(List<DetalleFacturaEN> detalleList) {
		this.detalleList = detalleList;
	}
	@Override
	public String toString() {
		return "MaestroFacturaEN [codigoM=" + codigoM + ", fechaM=" + fechaM + ", direccionM=" + direccionM
				+ ", subtotalM=" + subtotalM + ", ivaM=" + ivaM + ", descuentoM=" + descuentoM + ", totalM=" + totalM
				+ ", usuarioList=" + usuarioList + ", detalleList=" + detalleList + "]";
	}
	
	
	

}
