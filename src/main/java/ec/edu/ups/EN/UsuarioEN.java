package ec.edu.ups.EN;

import java.util.List;

public class UsuarioEN {
	private int codigoU;
	private String nombreU;
	private String apellidoU;
	private String generoU;
	private List<CategoriaEN> categoriaList;
	private List<TarjetaEN> tarjetaList;

	public int getCodigoU() {
		return codigoU;
	}

	public void setCodigoU(int codigoU) {
		this.codigoU = codigoU;
	}

	public String getNombreU() {
		return nombreU;
	}

	public void setNombreU(String nombreU) {
		this.nombreU = nombreU;
	}

	public String getApellidoU() {
		return apellidoU;
	}

	public void setApellidoU(String apellidoU) {
		this.apellidoU = apellidoU;
	}

	public String getGeneroU() {
		return generoU;
	}

	public void setGeneroU(String generoU) {
		this.generoU = generoU;
	}

	public List<TarjetaEN> getTargetaList() {
		return tarjetaList;
	}

	public void setTargetaList(List<TarjetaEN> targetaList) {
		this.tarjetaList = targetaList;
	}

	public List<CategoriaEN> getCategoriaList() {
		return categoriaList;
	}

	public void setCategoriaList(List<CategoriaEN> categoriaList) {
		this.categoriaList = categoriaList;
	}

	public List<TarjetaEN> getTarjetaList() {
		return tarjetaList;
	}

	public void setTarjetaList(List<TarjetaEN> tarjetaList) {
		this.tarjetaList = tarjetaList;
	}

	@Override
	public String toString() {
		return "UsuarioEN [codigoU=" + codigoU + ", nombreU=" + nombreU + ", apellidoU=" + apellidoU + ", generoU="
				+ generoU + ", targetaList=" + tarjetaList + "]";
	}

	public void lista(CategoriaEN cat) {
		if (categoriaList != null) {
			categoriaList.add(new CategoriaEN());
		} else
			categoriaList.add(cat);

	}

}
