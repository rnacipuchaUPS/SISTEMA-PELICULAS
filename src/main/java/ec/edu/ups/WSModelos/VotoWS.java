package ec.edu.ups.WSModelos;

public class VotoWS {

	private String voto;
	private int idPel;
	private int idUsu;
	public String getVoto() {
		return voto;
	}
	public void setVoto(String voto) {
		this.voto = voto;
	}
	public int getIdPel() {
		return idPel;
	}
	public void setIdPel(int idPel) {
		this.idPel = idPel;
	}
	public int getIdUsu() {
		return idUsu;
	}
	public void setIdUsu(int idUsu) {
		this.idUsu = idUsu;
	}
	@Override
	public String toString() {
		return "VotoWS [voto=" + voto + ", idPel=" + idPel + ", idUsu=" + idUsu + "]";
	}
		
}
