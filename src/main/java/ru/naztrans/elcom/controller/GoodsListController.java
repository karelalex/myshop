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
public class GoodsListController {
    @Inject
    private GoodsDAO goodsDAO;
    @Inject
    private CategoryDAO categoryDAO;

    public Collection<Good> getGoodsList() {
        return goodsDAO.getGods();
    }
    public String getCategoryName(String catId){
        Category temp = categoryDAO.getCatById(catId);
        if (temp==null) return "Категория не определена или удалена";
        return temp.getName();
    }
    public void removeGoodByID(String goodId){
        goodsDAO.removeGoodById(goodId);
    }
}
