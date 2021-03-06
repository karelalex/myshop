package ru.naztrans.elcom.sessionbeans;

import ru.naztrans.elcom.entity.Zakaz;
import ru.naztrans.elcom.entity.OrderItem;
import ru.naztrans.elcom.entity.Product;


import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


@SessionScoped
public class Basket implements Serializable {
    private final Zakaz zakaz = new Zakaz();

    public Basket() {
    }

    public void addProduct(Product product, int count) {
        for (OrderItem o: zakaz.getItems()){
            if (o.getProduct().getId().equals(product.getId())){
                count+=o.getCount();
                o.setCount(count);
                return;
            }
        }
        OrderItem oi = new OrderItem();
        oi.setProduct(product);
        oi.setCount(count);
        oi.setZakaz(zakaz);
        zakaz.getItems().add(oi);
    }

    public Zakaz getBasket() {
        return zakaz;
    }
}

