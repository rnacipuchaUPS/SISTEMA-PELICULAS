package ec.edu.ups.EN;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AdministradorEN {

	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	private String usuario;
	private String clave;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	@Override
	public String toString() {
		return "AdministradorEN [id=" + id + ", nombre=" + nombre + ", usuario=" + usuario + ", clave=" + clave + "]";
	}
	
	
}
