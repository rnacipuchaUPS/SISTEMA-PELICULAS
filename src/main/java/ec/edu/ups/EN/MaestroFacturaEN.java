package ec.edu.ups.EN;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class MaestroFacturaEN {
	
	@Id
	@GeneratedValue
	private int codigoM;
	private String fecha;
	private String direccion;
	private String subtotal;
	private Double iva;
	private Double precioExtra;
	private Double descuento;
	private Double total;
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "codigoM")
	private UsuarioEN usuario;
	
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
	public String getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}
	public Double getIva() {
		return iva;
	}
	public void setIva(Double iva) {
		this.iva = iva;
	}
	public Double getPrecioExtra() {
		return precioExtra;
	}
	public void setPrecioExtra(Double precioExtra) {
		this.precioExtra = precioExtra;
	}
	public Double getDescuento() {
		return descuento;
	}
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public List<DetalleFacturaEN> getDetalleList() {
		return detalleList;
	}
	public void setDetalleList(List<DetalleFacturaEN> detalleList) {
		this.detalleList = detalleList;
	}
	public UsuarioEN getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioEN usuario) {
		this.usuario = usuario;
	}
	@Override
	public String toString() {
		return "MaestroFacturaEN [codigoM=" + codigoM + ", fecha=" + fecha + ", direccion=" + direccion + ", subtotal="
				+ subtotal + ", iva=" + iva + ", precioExtra=" + precioExtra + ", descuento=" + descuento + ", total="
				+ total + ", usuario=" + usuario + ", detalleList=" + detalleList + "]";
	}
	
	
}
