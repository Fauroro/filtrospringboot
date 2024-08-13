package com.fauroro.filtrospringboot.domain.services.farmacy;

import com.fauroro.filtrospringboot.domain.repositories.FarmacyRepository;
import com.fauroro.filtrospringboot.persistence.entities.Farmacy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FarmacyImpl implements IFarmacy {

    @Autowired
    private FarmacyRepository farmacyRepository;
    @Override
    public List<Farmacy> findAll() {
        return (List<Farmacy>) farmacyRepository.findAll();    }

    @Override
    public Optional<Farmacy> findById(int farmacyCode) {
        return farmacyRepository.findById(farmacyCode);
    }

    @Override
    public Farmacy save(Farmacy farmacy) {
        return farmacyRepository.save(farmacy);
    }

    @Override
    public Optional<Farmacy> update(int farmacyCode, Farmacy updateFarmacy) {
        Optional<Farmacy> optionalFarmacy = farmacyRepository.findById(farmacyCode);
        optionalFarmacy.ifPresentOrElse(
                farmacy -> {
                    farmacy.setNamefarmacy(updateFarmacy.getNamefarmacy());
                    farmacy.setCity(updateFarmacy.getCity());
                    farmacy.setAddressfarmacy(updateFarmacy.getAddressfarmacy());
                    farmacy.setLatfarmacy(updateFarmacy.getLatfarmacy());
                    farmacy.setLongfarmacy(updateFarmacy.getLongfarmacy());
                    farmacy.setLogofarmacy(updateFarmacy.getLogofarmacy());
                    farmacyRepository.save(farmacy);
                }, () -> {
                    System.out.println("farmacy not registered");
                });
        return optionalFarmacy;
    }

    @Override
    public Optional<Farmacy> delete(int farmacyCode) {
        Optional<Farmacy> optFarmacy = farmacyRepository.findById(farmacyCode);
        if (optFarmacy.isEmpty()) {
            return Optional.empty();
        }
        farmacyRepository.delete(optFarmacy.get());
        return optFarmacy;
    }

}

