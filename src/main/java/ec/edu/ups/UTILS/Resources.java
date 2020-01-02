package ec.edu.ups.UTILS;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//@ApplicationPath("ddd")
public class Resources {

	@Produces
	@PersistenceContext
	private EntityManager em;
/*
	@Produces
	@RequestScoped
	public FacesContext prodiceFC() {
		return FacesContext.getCurrentInstance();
	}*/

}
