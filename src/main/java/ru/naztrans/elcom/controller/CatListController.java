package ru.naztrans.elcom.controller;

import ru.naztrans.elcom.dao.CategoryDAO;
import ru.naztrans.elcom.entity.Category;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.Collection;

@ViewScoped
@ManagedBean
public class CatListController {


    @Inject
    private CategoryDAO categoryDAO;

    public Collection<Category> getCatsList() {
        return categoryDAO.getCategories();
    }

    public void removeCatByID(String catId) {
        categoryDAO.removeCatById(catId);
    }

}
