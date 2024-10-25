package com.negocio.tienda.repositories;

import com.negocio.tienda.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {


/* Metodo creado para busqueda entre precios */
    List<Product> findProductByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);



}
