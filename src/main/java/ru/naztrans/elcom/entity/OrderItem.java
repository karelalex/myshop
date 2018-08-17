package ru.naztrans.elcom.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class OrderItem {
    @Id
    private String id = UUID.randomUUID().toString();
    private int count;



    @ManyToOne
    private Zakaz zakaz;

    public String getId() {
        return id;
    }
    public Zakaz getZakaz() {
        return zakaz;
    }

    public void setZakaz(Zakaz zakaz) {
        this.zakaz = zakaz;
    }
    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }



    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @OneToOne
    private Product product;
}
