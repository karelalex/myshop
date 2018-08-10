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
public class GoodEditController {



        @Inject
        private GoodsDAO goodsDAO;

        @Inject
        private CategoryDAO categoryDAO;


        private String id;


        private Good good = new Good();

        public void init() {
             final Good good = goodsDAO.getGoodById(id);
            if (good != null) this.good = good;
        }


        public String save() {
            goodsDAO.merge(good);
            return "goods-list.xhtml";
        }

        public Collection<Category> getCatList(){
            return categoryDAO.getCategories();
        }
        public Good getGood() {
            return good;
        }

        public void setGood( Good good) {
            this.good = good;
        }


        public String getId() {
            return id;
        }

        public void setId(final String id) {
            this.id = id;
        }
    }
