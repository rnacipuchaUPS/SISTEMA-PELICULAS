package ec.edu.ups.WSModelos;

public class FacturaDetalle {

	private int cantidad;
	private Double subtotal;
	private String descripcion;
	private int idPel;
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getIdPel() {
		return idPel;
	}
	public void setIdPel(int idPel) {
		this.idPel = idPel;
	}
	
	
}
