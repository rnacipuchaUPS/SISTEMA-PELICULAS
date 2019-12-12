package ec.edu.DAO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.EN.CategoriaEN;

@Stateless
public class CategoriaDAO {
	@Inject
	private EntityManager em;
	
	public void guardar(CategoriaEN c) {
		em.persist(c);
	}
	
	public void update(CategoriaEN c) {
		em.merge(c);
	}
	public void eliminar(int id) {
		em.remove(leer(id));
		}
	
	public CategoriaEN leer(int id) {
		return em.find(CategoriaEN.class, id);
	}
}
