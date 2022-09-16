package edu.sena.tostadora.entity;

import edu.sena.tostadora.entity.OrderDetails;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-09-15T20:48:59")
@StaticMetamodel(StatusOrders.class)
public class StatusOrders_ { 

    public static volatile SingularAttribute<StatusOrders, Date> createdAt;
    public static volatile CollectionAttribute<StatusOrders, OrderDetails> orderDetailsCollection;
    public static volatile SingularAttribute<StatusOrders, String> nameStatus;
    public static volatile SingularAttribute<StatusOrders, Integer> id;
    public static volatile SingularAttribute<StatusOrders, Date> updatedAt;

}