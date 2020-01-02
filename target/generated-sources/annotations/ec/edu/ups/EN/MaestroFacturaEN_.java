package ec.edu.ups.EN;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MaestroFacturaEN.class)
public abstract class MaestroFacturaEN_ {

	public static volatile SingularAttribute<MaestroFacturaEN, Integer> codigoM;
	public static volatile SingularAttribute<MaestroFacturaEN, String> fecha;
	public static volatile SingularAttribute<MaestroFacturaEN, Double> total;
	public static volatile ListAttribute<MaestroFacturaEN, UsuarioEN> usuarioList;
	public static volatile SingularAttribute<MaestroFacturaEN, Double> iva;
	public static volatile SingularAttribute<MaestroFacturaEN, String> subtotal;
	public static volatile SingularAttribute<MaestroFacturaEN, Double> descuento;
	public static volatile ListAttribute<MaestroFacturaEN, DetalleFacturaEN> detalleList;
	public static volatile SingularAttribute<MaestroFacturaEN, String> direccion;
	public static volatile SingularAttribute<MaestroFacturaEN, Double> precioExtra;

}

