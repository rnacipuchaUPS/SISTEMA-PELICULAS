package ec.edu.ups.WSModelos;

import java.util.List;

import ec.edu.ups.EN.DetalleFacturaEN;

public class Factura {

	private String fecha;
	private String direccion;
	private double subtotal;
	private double iva;
	private double precioExtra;
	private double descuento;
	private double total;
	private int idUsu;
	private List<DetalleFacturaEN> detalleList;

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getPrecioExtra() {
		return precioExtra;
	}

	public void setPrecioExtra(double precioExtra) {
		this.precioExtra = precioExtra;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getIdUsu() {
		return idUsu;
	}

	public void setIdUsu(int idUsu) {
		this.idUsu = idUsu;
	}

	public List<DetalleFacturaEN> getDetalleList() {
		return detalleList;
	}

	public void setDetalleList(List<DetalleFacturaEN> detalleList) {
		this.detalleList = detalleList;
	}

	@Override
	public String toString() {
		return "Factura [fecha=" + fecha + ", direccion=" + direccion + ", subtotal=" + subtotal + ", iva=" + iva
				+ ", precioExtra=" + precioExtra + ", descuento=" + descuento + ", total=" + total + ", idUsu=" + idUsu
				+ ", detalleList=" + detalleList + "]";
	}

}
