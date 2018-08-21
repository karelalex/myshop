package ru.naztrans.elcom.dto;

import ru.naztrans.elcom.entity.Category;
import ru.naztrans.elcom.entity.Product;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductDTO {

    private String id;
    private String categoryId;
    private String name;
    private String description;
    private double price;

    public ProductDTO(){};
    public ProductDTO(Product product){
        if (product==null) return;
        id=product.getId();
        name=product.getName();
        description=product.getDescription();
        price=product.getPrice();
        Category cat=product.getCategory();
        if (cat!=null) categoryId=cat.getId();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
