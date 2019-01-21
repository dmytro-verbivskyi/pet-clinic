package com.dverbivskyi.sfgpetclinic.service.map;

import com.dverbivskyi.sfgpetclinic.model.Owner;
import com.dverbivskyi.sfgpetclinic.service.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner save(Owner entity) {
        return super.save(entity);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
