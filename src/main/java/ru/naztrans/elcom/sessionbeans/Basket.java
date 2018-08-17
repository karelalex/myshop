package ru.naztrans.elcom.sessionbeans;

import ru.naztrans.elcom.entity.Product;


import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.HashMap;

@SessionScoped
public class Basket implements Serializable {
    private HashMap<Product, Integer> products;

    public void addProduct(Product product, int count){
        if (products.containsKey(product)) {
            count += products.get(product);

        }
        products.put(product, count);
    }
}

