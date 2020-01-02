package ec.edu.ups.EN;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DetalleFacturaEN.class)
public abstract class DetalleFacturaEN_ {

	public static volatile SingularAttribute<DetalleFacturaEN, String> descripcion;
	public static volatile ListAttribute<DetalleFacturaEN, PeliculaEN> pelicula;
	public static volatile SingularAttribute<DetalleFacturaEN, Double> subtotal;
	public static volatile SingularAttribute<DetalleFacturaEN, Integer> cantidad;
	public static volatile SingularAttribute<DetalleFacturaEN, Integer> codigoD;

}

