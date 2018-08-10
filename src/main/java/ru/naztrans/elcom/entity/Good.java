package ru.naztrans.elcom.entity;

import ru.naztrans.elcom.dao.CategoryDAO;

import javax.inject.Inject;
import java.util.UUID;

public class Good {
    private String id=UUID.randomUUID().toString();
    private String categoryID;
    private String name;
    private String description;
    private double price;
    public Good(){

    }

    public Good(String name, double price, String categoryID) {
        this.name = name;
        this.price = price;
        this.categoryID=categoryID;
    }

    public String getId() {
        return id;
    }



   @Inject
   private CategoryDAO cDAO;

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
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
