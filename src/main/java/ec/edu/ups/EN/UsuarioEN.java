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
import javax.validation.constraints.NotNull;

@Entity
public class UsuarioEN {
	@Id
	@GeneratedValue
	private int encodigo;
	@NotNull
	private String nombre;
	@NotNull
	private String apellido;
	@NotNull
	private String genero;
	@NotNull
	private String usuario;
	@NotNull
	private String clave;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "encodigo")
	private List<TarjetaEN> tarjetaList;
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "encodigo")
	private List<VotoEN> votoList;
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
	public List<VotoEN> getVotoList() {
		return votoList;
	}

	public void setVotoList(List<VotoEN> votoList) {
		this.votoList = votoList;
	}

	@Override
	public String toString() {
		return "UsuarioEN [encodigo=" + encodigo + ", nombre=" + nombre + ", apellido=" + apellido + ", genero="
				+ genero + ", usuario=" + usuario + ", clave=" + clave + ", tarjetaList=" + tarjetaList + ", votoList="
				+ votoList + "]";
	}

	public void addTarjeta(TarjetaEN taj) {
		if (this.tarjetaList == null)
			this.tarjetaList = new ArrayList<>();
		this.tarjetaList.add(taj);

	}
	
	public void addVoto(VotoEN vot) {
		if(this.votoList==null)
			this.votoList = new ArrayList<>();
		this.votoList.add(vot);
		
	}
}
