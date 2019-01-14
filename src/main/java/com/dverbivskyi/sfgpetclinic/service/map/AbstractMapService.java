package com.dverbivskyi.sfgpetclinic.service.map;

import com.dverbivskyi.sfgpetclinic.service.CrudService;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> implements CrudService<T, ID> {

    protected Map<ID, T> map = Maps.newHashMap();

    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    public T save(ID id, T entity) {
        map.put(id, entity);
        return entity;
    }

    @Override
    public Set<T> findAll() {
        return Sets.newHashSet(map.values());
    }

    @Override
    public void delete(T entity) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(entity));
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }
}
