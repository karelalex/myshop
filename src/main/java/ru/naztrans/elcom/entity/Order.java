package ru.naztrans.elcom.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class Order {
    @Id
    String id = UUID.randomUUID().toString();
    @Column
    Date date;
    @Column
    String clientName;
    @Column
    String clientPhone;
    @Column
    String deliveryAddress;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    List<OrderItem> items;
}
