package ec.edu.DAO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.EN.AdministradorEN;
@Stateless
public class AdministradorDAO {
	@Inject
	private EntityManager em;
	
	public void guardar(AdministradorEN c) {
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
	
	public boolean login(String usuario, String clave) {
		
		
		return true;
	}
}
