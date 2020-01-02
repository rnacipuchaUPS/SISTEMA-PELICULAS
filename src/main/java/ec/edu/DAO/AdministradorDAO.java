package ec.edu.DAO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.EN.AdministradorEN;

@Stateless
public class AdministradorDAO {
	@Inject
	private EntityManager em;

	public void guardar(AdministradorEN c) {
		if (leer(c.getId())!=null) {
			update(c);
		}else
		em.persist(c);
	}

	public void update(AdministradorEN c) {
		em.merge(c);
	}

	public void eliminar(int id) {
		em.remove(leer(id));
	}

	public AdministradorEN leer(int id) {
		return em.find(AdministradorEN.class, id);
	}

	public AdministradorEN login(String usuario, String clave) {
		AdministradorEN admi = new AdministradorEN();
		String jpql = "SELECT a FROM AdministradorEN a WHERE usuario LIKE :usu AND clave LIKE :cla";
		Query q = em.createQuery(jpql, AdministradorEN.class);
		q.setParameter("usu", usuario);
		q.setParameter("cla", clave);
		admi = (AdministradorEN) q.getSingleResult();
		return admi;
	}

}
