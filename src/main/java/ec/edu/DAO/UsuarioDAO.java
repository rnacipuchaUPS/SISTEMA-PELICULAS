package ec.edu.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.EN.PeliculaEN;
import ec.edu.ups.EN.UsuarioEN;

@Stateless
public class UsuarioDAO {
	@Inject
	private EntityManager em;

	public void guardar(UsuarioEN c) {
		em.persist(c);
	}

	public void update(UsuarioEN c) {
		em.merge(c);
	}

	public void eliminar(int id) {
		em.remove(leer(id));
	}

	public UsuarioEN leer(int id) {
		return em.find(UsuarioEN.class, id);
	}

	public List<UsuarioEN> listarPersonal() {

		String jqpl = "SELECT p FROM UsuarioEN p";
		Query query = em.createQuery(jqpl, UsuarioEN.class);
		List<UsuarioEN> lista = query.getResultList();
		for (UsuarioEN pel : lista) {
			pel.getTarjetaList().get(0).getCodigoT();
		}
		return lista;
	}
}
