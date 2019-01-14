package com.dverbivskyi.sfgpetclinic.service.map;

import com.dverbivskyi.sfgpetclinic.model.Vet;
import com.dverbivskyi.sfgpetclinic.service.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet save(Vet entity) {
        return map.put(entity.getId(), entity);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return null;
    }
}
