package ec.edu.ups.EN;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VotoEN {
	@Id
	@GeneratedValue
	private int codigoV;
	private int si;
	private int no;
	private int idPel;

	public int getCodigoV() {
		return codigoV;
	}

	public void setCodigoV(int codigoV) {
		this.codigoV = codigoV;
	}

	public int getSi() {
		return si;
	}

	public void setSi(int si) {
		this.si = si;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getIdPel() {
		return idPel;
	}

	public void setIdPel(int idPel) {
		this.idPel = idPel;
	}

	@Override
	public String toString() {
		return "VotoEN [codigoV=" + codigoV + ", si=" + si + ", no=" + no + ", idPel=" + idPel + "]";
	}

	

}
