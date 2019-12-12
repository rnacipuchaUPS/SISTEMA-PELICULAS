package ec.edu.DAO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.EN.MaestroFacturaEN;
@Stateless
public class MaestroFacturaDAO {
	@Inject
	private EntityManager em;
	
	public void guardar(MaestroFacturaEN c) {
		em.persist(c);
	}
	
	public void update(MaestroFacturaEN c) {
		em.merge(c);
	}
	public void eliminar(int id) {
		em.remove(leer(id));
		}
	
	public MaestroFacturaEN leer(int id) {
		return em.find(MaestroFacturaEN.class, id);
	}
}
