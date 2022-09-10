package edu.sena.tostadora.entity;

import edu.sena.tostadora.entity.Orders;
import edu.sena.tostadora.entity.Payments;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-09-09T18:45:01")
@StaticMetamodel(OrderDetailsPayments.class)
public class OrderDetailsPayments_ { 

    public static volatile SingularAttribute<OrderDetailsPayments, Date> createdAt;
    public static volatile SingularAttribute<OrderDetailsPayments, Orders> orderId;
    public static volatile SingularAttribute<OrderDetailsPayments, Payments> paymentId;
    public static volatile SingularAttribute<OrderDetailsPayments, Integer> id;
    public static volatile SingularAttribute<OrderDetailsPayments, Date> updatedAt;

}