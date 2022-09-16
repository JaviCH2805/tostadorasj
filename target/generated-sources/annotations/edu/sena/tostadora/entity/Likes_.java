package edu.sena.tostadora.entity;

import edu.sena.tostadora.entity.Products;
import edu.sena.tostadora.entity.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-09-15T20:48:59")
@StaticMetamodel(Likes.class)
public class Likes_ { 

    public static volatile SingularAttribute<Likes, Date> createdAt;
    public static volatile SingularAttribute<Likes, Products> productId;
    public static volatile SingularAttribute<Likes, Integer> id;
    public static volatile SingularAttribute<Likes, Users> users;
    public static volatile SingularAttribute<Likes, Date> updatedAt;

}