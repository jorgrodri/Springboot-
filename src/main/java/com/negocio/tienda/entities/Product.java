package com.negocio.tienda.entities;

import java.math.BigDecimal;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =AccessLevel.PRIVATE )
@Entity
@Table(name = "producto")
public class Product {

    @Id
    @GeneratedValue (strategy =  GenerationType.IDENTITY)
    Long id;
    @Column(name = "nombre",nullable = false)
    String name;
    @Column(name = "precio")
    BigDecimal price;
   
   @ManyToOne
    @JoinColumn(name = "id_fabricante", nullable = false)
   @JsonIgnore
   private Makir makir;


}
