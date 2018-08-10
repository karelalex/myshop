package ru.naztrans.elcom.controller;

import ru.naztrans.elcom.dao.CategoryDAO;
import ru.naztrans.elcom.dao.GoodsDAO;
import ru.naztrans.elcom.entity.Category;
import ru.naztrans.elcom.entity.Good;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.Collection;

@ViewScoped
@ManagedBean
public class CatEditController {

        @Inject
        private CategoryDAO categoryDAO;


        private String id;


        private Category cat = new Category();

        public void init() {
             final Category cat = categoryDAO.getCatById(id);
            if (cat != null) this.cat = cat;
        }


        public String save() {
            categoryDAO.merge(cat);
            return "cat-list.xhtml";
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Category getCat() {
        return cat;
    }

    public void setCat(Category cat) {
        this.cat = cat;
    }
}
