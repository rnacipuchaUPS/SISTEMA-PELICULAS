package ec.edu.ups.EN;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class MaestroFacturaEN {

	@Id
	@GeneratedValue
	private int codigoM;
	private String fecha;
	private String direccion;
	private double subtotal;
	private double iva;
	private double precioExtra;
	private double descuento;
	private double total;
	private int idUsu;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "codigoM")
	private List<DetalleFacturaEN> detalleList;

	public int getCodigoM() {
		return codigoM;
	}

	public void setCodigoM(int codigoM) {
		this.codigoM = codigoM;
	}

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

	public List<DetalleFacturaEN> getDetalleList() {
		return detalleList;
	}

	public void setDetalleList(List<DetalleFacturaEN> detalleList) {
		this.detalleList = detalleList;
	}

	public int getIdUsu() {
		return idUsu;
	}

	public void setIdUsu(int idUsu) {
		this.idUsu = idUsu;
	}

	@Override
	public String toString() {
		return "MaestroFacturaEN [codigoM=" + codigoM + ", fecha=" + fecha + ", direccion=" + direccion + ", subtotal="
				+ subtotal + ", iva=" + iva + ", precioExtra=" + precioExtra + ", descuento=" + descuento + ", total="
				+ total + ", idUsu=" + idUsu + ", detalleList=" + detalleList + "]";
	}
	
	public void add(DetalleFacturaEN def) {
		if(detalleList == null)
			detalleList = new ArrayList<DetalleFacturaEN>();
		detalleList.add(def);
	}

}
