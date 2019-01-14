package com.dverbivskyi.sfgpetclinic.service.map;

import com.dverbivskyi.sfgpetclinic.model.Owner;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> {

    @Override
    public Owner save(Owner entity) {
        return map.put(entity.getId(), entity);
    }
}
