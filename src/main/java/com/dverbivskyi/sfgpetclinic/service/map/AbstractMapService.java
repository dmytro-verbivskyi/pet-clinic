package com.dverbivskyi.sfgpetclinic.service.map;

import com.dverbivskyi.sfgpetclinic.model.BaseEntity;
import com.dverbivskyi.sfgpetclinic.service.CrudService;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> implements CrudService<T, ID> {

    protected Map<Long, T> map = Maps.newHashMap();

    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    public T save(T entity) {
        if (nonNull(entity) && isNull(entity.getId())) {
            entity.setId(getNextId());
        }
        map.put(entity.getId(), entity);
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

    private Long getNextId() {

        return Collections.max(map.keySet()) + 1;
    }
}
