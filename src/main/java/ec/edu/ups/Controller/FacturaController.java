package ec.edu.ups.Controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import ec.edu.ups.EN.MaestroFacturaEN;
import ec.edu.ups.ON.DetalleFacturaON;
import ec.edu.ups.ON.MaestroFacturaON;

@ManagedBean
@ViewScoped
public class FacturaController {

	@Inject
	private DetalleFacturaON don;
	@Inject
	private MaestroFacturaON mon;
	
	private List<MaestroFacturaEN> listM;
	
	public void init() {
		listM = mon.listaM();
	}

	public List<MaestroFacturaEN> getListM() {
		return listM;
	}

	public void setListM(List<MaestroFacturaEN> listM) {
		this.listM = listM;
	}
	
	
}
