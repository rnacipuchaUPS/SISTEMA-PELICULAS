package ec.edu.ups.EN;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class PeliculaEN {
	@Id
	@GeneratedValue
	@NotNull
	private int codigoP;
	@NotNull
	@Size(max = 50)
	private String titulo;
	@NotNull
	@Size(max = 100)
	private String descripcion;
	@NotNull
	@Size(max = 50)
	private String genero;
	@NotNull
	@Size(max = 10)
	private Double valor;
	@NotNull
	@Size(max = 5)
	private int cantidad;
	@OneToMany
	@JoinColumn(name = "codigo-Cate")
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
		if(this.categoriaList==null)
			this.categoriaList = new ArrayList<>();
		this.categoriaList.add(cat);
		
	}

	@Override
	public String toString() {
		return "PeliculaEN [codigoP=" + codigoP + ", titulo=" + titulo + ", descripcion=" + descripcion + ", genero="
				+ genero + ", valor=" + valor + ", cantidad=" + cantidad + ", categoriaList=" + categoriaList + "]";
	}


}
