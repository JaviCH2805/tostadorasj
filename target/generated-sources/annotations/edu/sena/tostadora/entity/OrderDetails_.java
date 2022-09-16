package edu.sena.tostadora.entity;

import edu.sena.tostadora.entity.Orders;
import edu.sena.tostadora.entity.Products;
import edu.sena.tostadora.entity.StatusOrders;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-09-15T20:48:59")
@StaticMetamodel(OrderDetails.class)
public class OrderDetails_ { 

    public static volatile SingularAttribute<OrderDetails, Date> createdAt;
    public static volatile SingularAttribute<OrderDetails, Integer> total;
    public static volatile SingularAttribute<OrderDetails, Integer> quantity;
    public static volatile SingularAttribute<OrderDetails, Products> productId;
    public static volatile SingularAttribute<OrderDetails, Orders> orderId;
    public static volatile SingularAttribute<OrderDetails, Integer> price;
    public static volatile SingularAttribute<OrderDetails, Integer> id;
    public static volatile SingularAttribute<OrderDetails, Date> updatedAt;
    public static volatile SingularAttribute<OrderDetails, StatusOrders> status;

}