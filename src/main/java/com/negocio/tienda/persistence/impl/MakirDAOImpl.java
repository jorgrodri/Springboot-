package com.negocio.tienda.persistence.impl;

import com.negocio.tienda.entities.Makir;
import com.negocio.tienda.persistence.IMakirDAO;

import com.negocio.tienda.repositories.MakirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MakirDAOImpl implements IMakirDAO {


    @Autowired
    MakirRepository makirRepository;


    @Override
    public List<Makir> findAll() {
        return (List<Makir>) makirRepository.findAll();
    }

    @Override
    public Optional<Makir> findById(Long id) {
        return makirRepository.findById(id);
    }

    @Override
    public void save(Makir makir) {
        makirRepository.save(makir);

    }

    @Override
    public void deleteById(Long id) {
        makirRepository.deleteById(id);

    }
}


