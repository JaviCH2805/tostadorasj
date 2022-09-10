package edu.sena.tostadora.entity;

import edu.sena.tostadora.entity.Products;
import edu.sena.tostadora.entity.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-09-09T18:45:01")
@StaticMetamodel(Carts.class)
public class Carts_ { 

    public static volatile SingularAttribute<Carts, Date> createdAt;
    public static volatile SingularAttribute<Carts, Integer> total;
    public static volatile SingularAttribute<Carts, Integer> quantity;
    public static volatile SingularAttribute<Carts, Products> productId;
    public static volatile SingularAttribute<Carts, Integer> price;
    public static volatile SingularAttribute<Carts, Integer> id;
    public static volatile SingularAttribute<Carts, Users> users;
    public static volatile SingularAttribute<Carts, Date> updatedAt;

}