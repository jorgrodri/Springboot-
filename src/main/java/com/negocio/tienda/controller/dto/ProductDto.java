package com.negocio.tienda.controller.dto;


import com.negocio.tienda.entities.Makir;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductDto {


    Long id;
    String name;
    BigDecimal price;
    private Makir makir;
}