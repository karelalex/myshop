package ru.naztrans.elcom.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public abstract class AbstractDAO {


    public static final String PERSISTENCE_UNIT = "elcom-persistence-unit";

    @PersistenceContext(unitName = PERSISTENCE_UNIT)
    protected EntityManager em;


    public <T> T getEntity(final TypedQuery<T>query) {
        final List<T> resultList = query.getResultList();
        if (resultList.isEmpty()) return null;
        return resultList.get(0);
    }

}


