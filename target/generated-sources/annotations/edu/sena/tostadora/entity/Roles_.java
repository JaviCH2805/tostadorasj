package edu.sena.tostadora.entity;

import edu.sena.tostadora.entity.Permissions;
import edu.sena.tostadora.entity.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-09-15T20:48:59")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile SingularAttribute<Roles, Date> createdAt;
    public static volatile SingularAttribute<Roles, String> nameRole;
    public static volatile SingularAttribute<Roles, Permissions> permissions;
    public static volatile SingularAttribute<Roles, String> description;
    public static volatile SingularAttribute<Roles, Integer> id;
    public static volatile CollectionAttribute<Roles, Users> usersCollection;
    public static volatile SingularAttribute<Roles, Date> updatedAt;

}