package ru.naztrans.elcom.controller;

import ru.naztrans.elcom.dao.ProductDAO;
import ru.naztrans.elcom.entity.Product;
import ru.naztrans.elcom.sessionbeans.Basket;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ViewScoped
@ManagedBean
public class ClientProductController {
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    private String productId;


    @Inject
    ProductDAO productDAO;
    @Inject
    Basket basket;

   public Product getProduct() {
       return productDAO.getProductById(productId);
   }

   public void add(){
       basket.addProduct(productDAO.getProductById(productId), 1);

   }
}
