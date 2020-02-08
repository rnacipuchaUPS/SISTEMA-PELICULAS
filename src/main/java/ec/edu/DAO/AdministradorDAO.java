package ec.edu.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.EN.AdministradorEN;

@Stateless
public class AdministradorDAO {
	@Inject
	private EntityManager em;

	public boolean guardar(AdministradorEN c) {
		for (AdministradorEN ae : lista()) {
			if (ae.getNombre().equals(c.getNombre())||ae.getUsuario().equals(c.getUsuario())) {
				return false;
			}
		}
		em.persist(c);
		return true;
		
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

	public List<AdministradorEN> lista(){
		String jpql ="SELECT a FROM AdministradorEN a";
		Query q = em.createQuery(jpql, AdministradorEN.class);
		return q.getResultList();
	}
	
	public AdministradorEN login(String usuario, String clave) {
		if (lista().size()>0) {
			for (int i = 0; i < lista().size(); i++) {
				if (lista().get(i).getUsuario().equals(usuario)&& lista().get(i).getClave().equals(clave)) {
					AdministradorEN admi = new AdministradorEN();
					String jpql = "SELECT a FROM AdministradorEN a WHERE a.usuario LIKE :usu AND a.clave LIKE :cla";
					Query q = em.createQuery(jpql, AdministradorEN.class);
					q.setParameter("usu", usuario);
					q.setParameter("cla", clave);
					admi = (AdministradorEN) q.getSingleResult();
					return admi;
				}
			}
		}
		return null;
		
	}

}
