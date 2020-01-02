package ec.edu.ups.EN;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PeliculaEN.class)
public abstract class PeliculaEN_ {

	public static volatile SingularAttribute<PeliculaEN, String> descripcion;
	public static volatile SingularAttribute<PeliculaEN, Integer> codigoP;
	public static volatile SingularAttribute<PeliculaEN, String> genero;
	public static volatile SingularAttribute<PeliculaEN, Double> valor;
	public static volatile SingularAttribute<PeliculaEN, String> titulo;
	public static volatile SingularAttribute<PeliculaEN, Integer> cantidad;
	public static volatile ListAttribute<PeliculaEN, CategoriaEN> categoriaList;

}

