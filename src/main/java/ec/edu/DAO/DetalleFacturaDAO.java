package ec.edu.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.EN.DetalleFacturaEN;
import ec.edu.ups.EN.MaestroFacturaEN;
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
	
	public List<DetalleFacturaEN> lista(){
		String jqpl = "SELECT v FROM DetalleFacturaEN v" ;
		Query query =  em.createQuery(jqpl, DetalleFacturaEN.class);
		List<DetalleFacturaEN> lista = query.getResultList();	
		return lista;	
	}
}
