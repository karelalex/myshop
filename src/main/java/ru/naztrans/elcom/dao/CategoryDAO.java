package ru.naztrans.elcom.dao;

import ru.naztrans.elcom.entity.Category;


import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;


@ApplicationScoped
public class CategoryDAO {


        private Map<String, Category> cats= new LinkedHashMap<>();

        @PostConstruct
        private void init() {
            merge(new Category("Игрушки", "1"));
            merge(new Category("Книги", "2"));
        }
        public Collection<Category> getCategories() {
            return cats.values();
        }

        public Category getCatById(String catId) {
            if (catId == null || catId.isEmpty()) return null;
            return cats.get(catId);
        }

        public Category merge(Category cat) {
            if (cat == null) return null;
            final String id = cat.getId();
            if (id == null || id.isEmpty()) return null;
            cats.put(id, cat);
            return cat;
        }

        public void removeCatById(String catId) {
            if (catId == null || catId.isEmpty()) return;
            if (!cats.containsKey(catId)) return;
            cats.remove(catId);
        }
    }

