package ru.naztrans.elcom.dao;

import ru.naztrans.elcom.entity.Product;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Stateless
public class ProductDAO extends AbstractDAO{
    public Product getProductById (String pId){
        if(pId==null|| pId.isEmpty()) return null;
        return getEntity(em.createQuery("select e from Product e where e.id=:id", Product.class).setParameter("id", pId).setMaxResults(1));
    }
    public List<Product> getProducts() {
        return em.createQuery("SELECT e FROM Product e ORDER BY e.name DESC", Product.class).getResultList();
    }
    public  List<Product> getProductFromCategory(String categoryID) {
        if(categoryID==null|| categoryID.isEmpty()) return null;
        return em.createQuery("select e from Product e where e.category.id=:id", Product.class).setParameter("id",categoryID).getResultList();
    }
    public Product persist(Product product){
        if (product==null) return null;
        em.persist(product);
        return product;
    }
    public Product merge(Product product) {
        if (product==null) return null;
        return em.merge(product);
    }

    public void removeProductById(String id){
        Product product = getProductById(id);
        if (product==null) return;
        em.remove(product);
    }

}
