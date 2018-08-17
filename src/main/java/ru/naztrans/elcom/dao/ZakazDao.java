package ru.naztrans.elcom.dao;

import ru.naztrans.elcom.entity.Zakaz;

public class ZakazDao extends AbstractDAO {
    public Zakaz persist(Zakaz zakaz){
        if (zakaz ==null) return null;
        em.persist(zakaz);
        return zakaz;
    }
    public Zakaz merge(Zakaz zakaz) {
        if (zakaz ==null) return null;
        return em.merge(zakaz);
    }
}
