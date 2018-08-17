package ru.naztrans.elcom.sessionbeans;

import ru.naztrans.elcom.entity.Zakaz;
import ru.naztrans.elcom.entity.OrderItem;
import ru.naztrans.elcom.entity.Product;


import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;

@SessionScoped
public class Basket implements Serializable {
    private final Zakaz zakaz = new Zakaz();

    public Basket() {
    }

    public void addProduct(Product product, int count) {
        if (zakaz.getItems() == null) {
            zakaz.setItems(new ArrayList<OrderItem>());
        }
        OrderItem oi = new OrderItem();
        oi.setProduct(product);
        oi.setCount(count);
        zakaz.getItems().add(oi);
    }

    public Zakaz getBasket() {
        return zakaz;
    }
}

