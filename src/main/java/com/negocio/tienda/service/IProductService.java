package com.negocio.tienda.service;

import com.negocio.tienda.entities.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductService
{



    List<Product> findAll();

    Optional<Product> findById(Long id);

    List<Product> findByPrice(BigDecimal minPrice, BigDecimal maxPrice);

    void save(Product product);

    void deleteById(Long id);
}

