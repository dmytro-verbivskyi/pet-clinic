package com.dverbivskyi.sfgpetclinic.service.map;

import com.dverbivskyi.sfgpetclinic.model.Vet;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> {

    @Override
    public Vet save(Vet entity) {
        return map.put(entity.getId(), entity);
    }
}
