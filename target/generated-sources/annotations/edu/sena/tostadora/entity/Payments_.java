package edu.sena.tostadora.entity;

import edu.sena.tostadora.entity.MethodPayments;
import edu.sena.tostadora.entity.OrderDetailsPayments;
import edu.sena.tostadora.entity.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-09-15T20:48:59")
@StaticMetamodel(Payments.class)
public class Payments_ { 

    public static volatile SingularAttribute<Payments, Date> createdAt;
    public static volatile SingularAttribute<Payments, Integer> total;
    public static volatile SingularAttribute<Payments, MethodPayments> methodPaymentId;
    public static volatile SingularAttribute<Payments, Integer> id;
    public static volatile SingularAttribute<Payments, Users> users;
    public static volatile CollectionAttribute<Payments, OrderDetailsPayments> orderDetailsPaymentsCollection;
    public static volatile SingularAttribute<Payments, Date> updatedAt;

}