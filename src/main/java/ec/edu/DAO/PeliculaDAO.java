package ec.edu.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.EN.PeliculaEN;
@Stateless
public class PeliculaDAO {

	@Inject
	private EntityManager em;

	public void guardar(PeliculaEN c) {
		System.out.println(c.toString());
		em.persist(c);
		
	}

	public void update(PeliculaEN c) {
		em.merge(c);
	}

	public void eliminar(int id) {
		em.remove(leer(id));
	}

	public PeliculaEN leer(int id) {
		return em.find(PeliculaEN.class, id);
	}
	
public List<PeliculaEN> listarPersonal() {
		
		String jqpl = "SELECT p FROM PeliculaEN p" ;
		Query query =  em.createQuery(jqpl, PeliculaEN.class);
		List<PeliculaEN> lista = query.getResultList();
		for(PeliculaEN pel: lista) {
			pel.getCategoriaList().get(0).getCodigoC();
		}
		return lista;
	}
}