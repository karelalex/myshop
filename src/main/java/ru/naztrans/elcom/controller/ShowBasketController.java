package ru.naztrans.elcom.controller;

import ru.naztrans.elcom.dao.ZakazDao;
import ru.naztrans.elcom.dao.ZakazDao;
import ru.naztrans.elcom.entity.Zakaz;
import ru.naztrans.elcom.sessionbeans.Basket;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.Date;

@ViewScoped
@ManagedBean
public class ShowBasketController {
    @Inject
    private Basket basket;

    @Inject
    private ZakazDao zakazDao;

    public Zakaz getZakaz() {
        return zakaz;
    }

    public void setZakaz(Zakaz zakaz) {
        this.zakaz = zakaz;
    }

    private Zakaz zakaz;

    public void init() {
        this.zakaz = basket.getBasket();
    }

    public String makeOrder() {
        zakaz.setDate(new Date());
        zakazDao.merge(zakaz);
        return "client-cat-list.xhtml";
    }


}
