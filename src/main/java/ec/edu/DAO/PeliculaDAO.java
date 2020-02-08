package ec.edu.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.EN.AdministradorEN;
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

		String jqpl = "SELECT p FROM PeliculaEN p";
		Query query = em.createQuery(jqpl, PeliculaEN.class);
		List<PeliculaEN> lista = query.getResultList();
		return lista;
	}

	public List<PeliculaEN> listarPelBusq(String titulo) {
		String jqpl = "SELECT p FROM PeliculaEN p WHERE p.titulo like :tit";
		Query query = em.createQuery(jqpl, PeliculaEN.class);
		query.setParameter("tit", titulo);
		List<PeliculaEN> lista = query.getResultList();
		return lista;		
	}
}