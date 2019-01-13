package com.dverbivskyi.sfgpetclinic.service;

import com.dverbivskyi.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
