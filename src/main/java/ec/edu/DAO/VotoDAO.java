package ec.edu.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.EN.PeliculaEN;
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
	
	public List<VotoEN> lista(){
		String jqpl = "SELECT v FROM VotoEN v" ;
		Query query =  em.createQuery(jqpl, VotoEN.class);
		List<VotoEN> lista = query.getResultList();	
		return lista;	
	}
}
