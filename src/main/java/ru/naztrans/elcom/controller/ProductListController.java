package ru.naztrans.elcom.controller;

import ru.naztrans.elcom.dao.CategoryDAO;
import ru.naztrans.elcom.dao.ProductsDAO;
import ru.naztrans.elcom.entity.Category;
import ru.naztrans.elcom.entity.Product;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.Collection;

@ViewScoped
@ManagedBean
public class ProductListController {
    @Inject
    private ProductsDAO productsDAO;


    public Collection<Product> getProductList() {
        return productsDAO.getProducts();
    }

    public void removeProductByID(String productId) {
        productsDAO.removeProductById(productId);
    }
}
