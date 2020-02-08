package ec.edu.ups.EN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class PeliculaEN {
	@Id
	@GeneratedValue
	private int codigoP;
	@NotNull
	private String titulo;
	@NotNull
	private String descripcion;
	@NotNull
	private String genero;
	private Double valor;
	private int cantidad;
	@Lob()
	private byte[] imagen;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "codigoP")
	private List<CategoriaEN> categoriaList;

	public int getCodigoP() {
		return codigoP;
	}

	public void setCodigoP(int codigoP) {
		this.codigoP = codigoP;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public List<CategoriaEN> getCategoriaList() {
		return categoriaList;
	}

	public void setCategoriaList(List<CategoriaEN> categoriaList) {
		this.categoriaList = categoriaList;
	}

	public void addCategoria(CategoriaEN cat) {
		if (this.categoriaList == null)
			this.categoriaList = new ArrayList<>();
		this.categoriaList.add(cat);

	}


	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}


	@Override
	public String toString() {
		return "PeliculaEN [codigoP=" + codigoP + ", titulo=" + titulo + ", descripcion=" + descripcion + ", genero="
				+ genero + ", valor=" + valor + ", cantidad=" + cantidad + ", imagen=" + Arrays.toString(imagen)
				+ ", categoriaList=" + categoriaList +  "]";
	}

}
