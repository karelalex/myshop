package ru.naztrans.elcom.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class OrderItem {
    @Id
    private String id = UUID.randomUUID().toString();
    private int count;
    @ManyToOne
    private Order order;
    @OneToOne
    private Product product;
}
