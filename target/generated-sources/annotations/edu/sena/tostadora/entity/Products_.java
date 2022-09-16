package edu.sena.tostadora.entity;

import edu.sena.tostadora.entity.Carts;
import edu.sena.tostadora.entity.Category;
import edu.sena.tostadora.entity.Comments;
import edu.sena.tostadora.entity.Likes;
import edu.sena.tostadora.entity.OrderDetails;
import edu.sena.tostadora.entity.Wishlist;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-09-15T20:48:59")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile SingularAttribute<Products, String> image;
    public static volatile CollectionAttribute<Products, OrderDetails> orderDetailsCollection;
    public static volatile SingularAttribute<Products, String> description;
    public static volatile CollectionAttribute<Products, Wishlist> wishlistCollection;
    public static volatile CollectionAttribute<Products, Carts> cartsCollection;
    public static volatile SingularAttribute<Products, Date> createdAt;
    public static volatile SingularAttribute<Products, Integer> price;
    public static volatile SingularAttribute<Products, Integer> id;
    public static volatile CollectionAttribute<Products, Comments> commentsCollection;
    public static volatile CollectionAttribute<Products, Likes> likesCollection;
    public static volatile SingularAttribute<Products, String> nameProduct;
    public static volatile SingularAttribute<Products, Category> categoryId;
    public static volatile SingularAttribute<Products, Date> updatedAt;

}