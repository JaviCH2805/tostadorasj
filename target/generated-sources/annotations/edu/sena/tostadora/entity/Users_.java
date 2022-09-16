package edu.sena.tostadora.entity;

import edu.sena.tostadora.entity.Carts;
import edu.sena.tostadora.entity.Comments;
import edu.sena.tostadora.entity.Likes;
import edu.sena.tostadora.entity.Orders;
import edu.sena.tostadora.entity.Payments;
import edu.sena.tostadora.entity.Roles;
import edu.sena.tostadora.entity.Wishlist;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-09-15T20:48:59")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> country;
    public static volatile SingularAttribute<Users, String> nameUser;
    public static volatile SingularAttribute<Users, Roles> roleId;
    public static volatile CollectionAttribute<Users, Wishlist> wishlistCollection;
    public static volatile SingularAttribute<Users, String> adress;
    public static volatile CollectionAttribute<Users, Orders> ordersCollection;
    public static volatile CollectionAttribute<Users, Carts> cartsCollection;
    public static volatile SingularAttribute<Users, Date> createdAt;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, String> phoneNumber;
    public static volatile CollectionAttribute<Users, Payments> paymentsCollection;
    public static volatile SingularAttribute<Users, Integer> id;
    public static volatile CollectionAttribute<Users, Comments> commentsCollection;
    public static volatile CollectionAttribute<Users, Likes> likesCollection;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile SingularAttribute<Users, Date> updatedAt;

}