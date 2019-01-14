package com.dverbivskyi.sfgpetclinic.service.map;

import com.dverbivskyi.sfgpetclinic.model.Pet;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> {

    @Override
    public Pet save(Pet entity) {
        return map.put(entity.getId(), entity);
    }
}
