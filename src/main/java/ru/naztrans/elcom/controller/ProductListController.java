package ru.naztrans.elcom.controller;

import ru.naztrans.elcom.dao.ProductDAO;
import ru.naztrans.elcom.entity.Product;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.Collection;

@ViewScoped
@ManagedBean
public class ProductListController {
    @Inject
    private ProductDAO productDAO;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    private String categoryId;
    public Collection<Product> getProductList() {
        return productDAO.getProducts();
    }

    public Collection<Product> getProductListByCategoryId(String categoryID) {return productDAO.getProductFromCategory(categoryID);}

    public void removeProductByID(String productId) {
        productDAO.removeProductById(productId);
    }
}
