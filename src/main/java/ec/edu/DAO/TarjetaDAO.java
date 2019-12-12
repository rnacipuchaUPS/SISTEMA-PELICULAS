package ec.edu.DAO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.EN.TarjetaEN;
@Stateless
public class TarjetaDAO {
	@Inject
	private EntityManager em;
	
	public void guardar(TarjetaEN c) {
		em.persist(c);
	}
	
	public void update(TarjetaEN c) {
		em.merge(c);
	}
	public void eliminar(int id) {
		em.remove(leer(id));
		}
	
	public TarjetaEN leer(int id) {
		return em.find(TarjetaEN.class, id);
	}
}
