package ru.naztrans.elcom.controller;

import ru.naztrans.elcom.dao.CategoryDAO;
import ru.naztrans.elcom.dao.ProductDAO;
import ru.naztrans.elcom.entity.Category;
import ru.naztrans.elcom.entity.Product;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ViewScoped
@ManagedBean
public class ProductEditController {


    @Inject
    private ProductDAO productDAO;

    @Inject
    private CategoryDAO categoryDAO;
    private String pId;
    private List<Category> catList;

    public List<Category> getCatList() {
        return catList;
    }

    public void setCatList(List<Category> catList) {
        this.catList = catList;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    private String catId;

    private Product product = new Product();

    public void init() {
        final Product product = productDAO.getProductById(pId);
        if (product != null) this.product = product;
        catList=categoryDAO.getCategories();
    }

    public String save() {
        Category category= categoryDAO.getCatById(catId);
        this.product.setCategory(category);
        productDAO.merge(product);
        return "products-list.xhtml";
    }


}

