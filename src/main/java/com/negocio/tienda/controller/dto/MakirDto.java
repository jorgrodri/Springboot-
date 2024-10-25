package com.negocio.tienda.controller.dto;


import com.negocio.tienda.entities.Product;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MakirDto {


    Long id;
    String name;
    private List<Product> productList = new ArrayList<>();





}
