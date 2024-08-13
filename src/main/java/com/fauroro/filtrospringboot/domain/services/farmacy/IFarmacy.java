package com.fauroro.filtrospringboot.domain.services.farmacy;

import com.fauroro.filtrospringboot.persistence.entities.Farmacy;

import java.util.List;
import java.util.Optional;

public interface IFarmacy {
    List<Farmacy> findAll();
    Optional<Farmacy> findById(int farmacyCode);
    Farmacy save(Farmacy farmacy);
    Optional<Farmacy> update(int farmacyCode, Farmacy farmacy);
    Optional<Farmacy> delete(int farmacyCode);

}
