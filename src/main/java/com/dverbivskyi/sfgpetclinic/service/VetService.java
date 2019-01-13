package com.dverbivskyi.sfgpetclinic.service;

import com.dverbivskyi.sfgpetclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long> {

    Vet findByLastName(String lastName);

}
