package com.negocio.tienda.controller;


import com.negocio.tienda.controller.dto.ProductDto;
import com.negocio.tienda.entities.Product;
import com.negocio.tienda.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {


    @Autowired
    private IProductService productService;

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id) {
        Optional<Product> productOptional = productService.findById(id);

        if (productOptional.isPresent()) {
            Product product = productOptional.get();
            ProductDto productDto = ProductDto.builder()
                    .id(product.getId())
                    .name(product.getName())
                    .price(product.getPrice())
                    .build();
            return ResponseEntity.ok(productDto);
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {
        List<ProductDto> productDTOList = productService.findAll()
                .stream()
                .map(product -> ProductDto.builder()
                        .id(product.getId())
                        .name(product.getName())
                        .price(product.getPrice())
                        .makir(product.getMakir())
                        .build())
                .toList();
        return ResponseEntity.ok(productDTOList);
    }


    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody ProductDto productDTO) throws URISyntaxException {

        if (productDTO.getName().isBlank() || productDTO.getPrice() == null || productDTO.getMakir() == null) {
            return ResponseEntity.badRequest().build();
        }
        Product product = Product.builder()
                .name(productDTO.getName())
                .price(productDTO.getPrice())
                .makir(productDTO.getMakir())
                .build();
        productService.save(product);
        return ResponseEntity.created(new URI("/api/product/save")).build();

    }


    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody ProductDto productDTO) {
        Optional<Product> productOptional = productService.findById(id);
        if (productOptional.isPresent()) {
            Product product = productOptional.get();
            product.setName(productDTO.getName());
            product.setPrice(productDTO.getPrice());
            product.setMakir(productDTO.getMakir());
            productService.save(product);
            return ResponseEntity.ok("updated");
        }
        return ResponseEntity.notFound().build();
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {

        if (id != null) {
            productService.deleteById(id);
            return ResponseEntity.ok("deleted");
        }
        return ResponseEntity.notFound().build();

    }
}