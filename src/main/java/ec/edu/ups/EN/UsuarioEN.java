package ec.edu.ups.EN;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class UsuarioEN {
	@Id
	@GeneratedValue
	private int encodigo;
	@NotNull
	@Size(max = 70)
	private String nombre;
	@NotNull
	@Size(max = 70)
	private String apellido;
	@NotNull
	@Size(max = 20)
	private String genero;
	@NotNull
	@Size(max = 8)
	private String usuario;
	@NotNull
	@Size(min = 8, max = 20)
	private String clave;
	@OneToMany(cascade= {CascadeType.ALL})
	@JoinColumn(name = "codigo-Tar")
	private List<TarjetaEN> tarjetaList;
	public int getEncodigo() {
		return encodigo;
	}
	public void setEncodigo(int encodigo) {
		this.encodigo = encodigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
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
	public List<TarjetaEN> getTarjetaList() {
		return tarjetaList;
	}
	public void setTarjetaList(List<TarjetaEN> tarjetaList) {
		this.tarjetaList = tarjetaList;
	}
	@Override
	public String toString() {
		return "UsuarioEN [encodigo=" + encodigo + ", nombre=" + nombre + ", apellido=" + apellido + ", genero="
				+ genero + ", usuario=" + usuario + ", clave=" + clave + ", tarjetaList=" + tarjetaList + "]";
	}
	
	public void addTarjeta(TarjetaEN taj) {
		if(this.tarjetaList==null)
			this.tarjetaList = new ArrayList<>();
		this.tarjetaList.add(taj);
		
	}
}
