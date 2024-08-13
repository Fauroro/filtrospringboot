package com.fauroro.filtrospringboot.domain.repositories;

import com.fauroro.filtrospringboot.persistence.entities.Administration;
import org.springframework.data.repository.CrudRepository;

public interface AdministrationRepository extends CrudRepository<Administration,String> {

}
