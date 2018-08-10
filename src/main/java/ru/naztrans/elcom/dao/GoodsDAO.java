package ru.naztrans.elcom.dao;

import ru.naztrans.elcom.entity.Good;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

@ApplicationScoped
public class GoodsDAO {
    private Map<String, Good> goods= new LinkedHashMap<>();

    @PostConstruct
    private void init() {
        merge(new Good("Игрушка танк", 34.6, "1"));
        merge(new Good("Маленький принц", 17.6, "3"));
    }
    public Collection<Good> getGods() {
        return goods.values();
    }

    public Good getGoodById(String goodId) {
        if (goodId == null || goodId.isEmpty()) return null;
        return goods.get(goodId);
    }

    public Good merge(Good good) {
        if (good == null) return null;
        final String id = good.getId();
        if (id == null || id.isEmpty()) return null;
        goods.put(id, good);
        return good;
    }

    public void removeGoodById(String goodId) {
        if (goodId == null || goodId.isEmpty()) return;
        if (!goods.containsKey(goodId)) return;
        goods.remove(goodId);
    }
}
