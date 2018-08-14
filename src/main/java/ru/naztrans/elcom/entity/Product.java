package ru.naztrans.elcom.entity;

import ru.naztrans.elcom.dao.CategoryDAO;

import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;
@Entity
public class Product {
    @Id
    private String id=UUID.randomUUID().toString();
    @ManyToOne()
    private Category category;
    private String name;
    private String description;
    private double price;
    public Product(){

    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getId() {
        return id;
    }





    public void setId(String id) {
        this.id = id;
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
