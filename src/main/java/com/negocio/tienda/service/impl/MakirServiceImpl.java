package com.negocio.tienda.service.impl;

import com.negocio.tienda.entities.Makir;
import com.negocio.tienda.persistence.IMakirDAO;
import com.negocio.tienda.service.IMakirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MakirServiceImpl implements IMakirService {

    @Autowired
    private  IMakirDAO makirDAO; //IMakirDAO

    @Override
    public List<Makir> findAll() {
        return makirDAO.findAll();
    }

    @Override
    public Optional<Makir> findById(Long id) {
        return makirDAO.findById(id);
    }

    @Override
    public void save(Makir makir) {
        makirDAO.save(makir);

    }

    @Override
    public void deleteById(Long id) {
        makirDAO.deleteById(id);

    }
}
