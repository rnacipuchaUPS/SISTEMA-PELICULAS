package ec.edu.ups.EN;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UsuarioEN.class)
public abstract class UsuarioEN_ {

	public static volatile SingularAttribute<UsuarioEN, String> clave;
	public static volatile ListAttribute<UsuarioEN, TarjetaEN> tarjetaList;
	public static volatile SingularAttribute<UsuarioEN, String> apellido;
	public static volatile SingularAttribute<UsuarioEN, String> genero;
	public static volatile SingularAttribute<UsuarioEN, String> usuario;
	public static volatile SingularAttribute<UsuarioEN, Integer> encodigo;
	public static volatile SingularAttribute<UsuarioEN, String> nombre;

}

