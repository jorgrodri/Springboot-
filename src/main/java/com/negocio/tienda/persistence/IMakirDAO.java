package com.negocio.tienda.persistence;

import com.negocio.tienda.entities.Makir;

import java.util.List;
import java.util.Optional;

public interface IMakirDAO {


     List<Makir> findAll();

      Optional<Makir>findById(Long id);

     void save(Makir makir);

     void deleteById(Long id);

    
}
