package com.negocio.tienda.service;

import com.negocio.tienda.entities.Makir;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface IMakirService {



    List<Makir> findAll();

    Optional<Makir> findById(Long id);

    void save(Makir makir);

    void deleteById(Long id);
}
