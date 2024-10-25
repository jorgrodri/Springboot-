package com.negocio.tienda.repositories;

import com.negocio.tienda.entities.Makir;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakirRepository extends CrudRepository<Makir,Long> {
}
