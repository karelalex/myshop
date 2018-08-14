package ru.naztrans.elcom.dao;

import ru.naztrans.elcom.entity.Category;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class CategoryDAO extends AbstractDAO {
    public List<Category> getCategories() {
        return em.createQuery("SELECT e FROM Category e ORDER BY e.name DESC", Category.class).getResultList();
    }

    public Category getCatById(String catId) {
        if (catId == null || catId.isEmpty()) return null;
        return getEntity(em.createQuery("select e from Category e where e.id=:id", Category.class)
                .setParameter("id", catId).setMaxResults(1));
    }

    public Category persist(Category category) {
        if (category == null) return null;
        em.persist(category);
        return category;
    }

    public Category merge(Category category) {
        if (category == null) return null;
        return em.merge(category);
    }

    public void removeCatById(String catId) {
        Category category = getCatById(catId);
        if (category == null) return;
        em.remove(category);
    }
}

