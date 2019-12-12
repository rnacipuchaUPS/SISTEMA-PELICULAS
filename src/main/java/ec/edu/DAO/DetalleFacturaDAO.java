package ec.edu.DAO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.EN.DetalleFacturaEN;
@Stateless
public class DetalleFacturaDAO {
	@Inject
	private EntityManager em;
	
	public void guardar(DetalleFacturaEN c) {
		em.persist(c);
	}
	
	public void update(DetalleFacturaEN c) {
		em.merge(c);
	}
	public void eliminar(int id) {
		em.remove(leer(id));
		}
	
	public DetalleFacturaEN leer(int id) {
		return em.find(DetalleFacturaEN.class, id);
	}
}
