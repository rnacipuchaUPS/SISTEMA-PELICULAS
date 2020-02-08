package ec.edu.ups.ON;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.DAO.PeliculaDAO;
import ec.edu.DAO.UsuarioDAO;
import ec.edu.DAO.VotoDAO;
import ec.edu.ups.EN.PeliculaEN;
import ec.edu.ups.EN.UsuarioEN;
import ec.edu.ups.EN.VotoEN;
import ec.edu.ups.WSModelos.VotoWS;

@Stateless
public class VotoON {

	@Inject
	private VotoDAO vdao;
	@Inject
	private PeliculaDAO pdao;
	@Inject
	private UsuarioDAO udao;

	public boolean guardarVoto(VotoWS v) {
		VotoEN ve = new VotoEN();
		PeliculaEN p = new PeliculaEN();
		UsuarioEN u = new UsuarioEN();

		u = udao.leer(v.getIdUsu());
		p = pdao.leer(v.getIdPel());
		for (int i = 0; i < u.getVotoList().size(); i++) {
			if (u.getVotoList().get(i).getIdPel() == p.getCodigoP()) {
				int vn = u.getVotoList().get(i).getNo();
				int vs = u.getVotoList().get(i).getSi();
				if (v.getVoto().equals("SI")) {
					u.getVotoList().get(i).setNo(vn - 1);
				} else {
					u.getVotoList().get(i).setNo(vs + 1);
				}
				udao.update(u);
				return true;
			}
		}
		

		if (v.getVoto().equals("SI")) {
			ve.setIdPel(v.getIdPel());
			ve.setSi(1);
			ve.setNo(0);
		} else {
			ve.setIdPel(v.getIdPel());
			ve.setSi(0);
			ve.setNo(1);
		}
		u.addVoto(ve);
		udao.update(u);
		return true;
	}

	public List<VotoEN> listaV() {
		return vdao.lista();
	}

	public List<VotoEN> listaBusquedaSi() {
		List<VotoEN> ls = new ArrayList<VotoEN>();
		for (VotoEN ve : vdao.lista()) {
			if (ve.getSi() > 0) {
				ls.add(ve);
			}
		}
		return ls;
	}

	public List<VotoEN> listaBusquedaNo() {
		List<VotoEN> ls = new ArrayList<VotoEN>();
		for (VotoEN ve : vdao.lista()) {
			if (ve.getNo() > 0) {
				ls.add(ve);
			}
		}
		return ls;
	}

}
