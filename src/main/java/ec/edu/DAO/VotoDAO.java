package ec.edu.DAO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.EN.VotoEN;
@Stateless
public class VotoDAO {
	@Inject
	private EntityManager em;
	
	public void guardar(VotoEN c) {
		em.persist(c);
	}
	
	public void update(VotoEN c) {
		em.merge(c);
	}
	public void eliminar(int id) {
		em.remove(leer(id));
		}
	
	public VotoEN leer(int id) {
		return em.find(VotoEN.class, id);
	}
}
