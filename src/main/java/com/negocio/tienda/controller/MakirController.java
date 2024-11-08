package com.negocio.tienda.controller;


import com.negocio.tienda.controller.dto.MakirDto;
import com.negocio.tienda.entities.Makir;
import com.negocio.tienda.service.IMakirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MakirController {

    @Autowired
    private IMakirService makirService;

    @RequestMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id) {
        Optional<Makir> makirOptional = makirService.findById(id);

        if (makirOptional.isPresent()) {
            Makir makir = makirOptional.get();

            MakirDto makirDTO = MakirDto.builder()
                    .id(makir.getId())
                    .name(makir.getName())
                    .productList(makir.getProductosList())
                    .build();

            return ResponseEntity.ok(makirDTO);
        }

        return ResponseEntity.notFound().build();
    }


    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {

        List<MakirDto> makirDTOList = makirService.findAll()
                .stream()
                .map(makir -> MakirDto.builder()
                        .id(makir.getId())
                        .name(makir.getName())
                        .productList(makir.getProductosList())
                        .build())
                .toList();

        return ResponseEntity.ok(makirDTOList);
    }


    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody MakirDto makirDTO) throws URISyntaxException {


        if (makirDTO.getName().isBlank()) {
            return ResponseEntity.badRequest().build();
        }
        makirService.save(Makir.builder()
                .name(makirDTO.getName())
                .build());

        return ResponseEntity.created(new URI("/api/makir/save")).build();

    }


    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody MakirDto makirDTO) {

        Optional<Makir> makirOptional = makirService.findById(id);

        if (makirOptional.isPresent()) {
            Makir makir = makirOptional.get();
            makir.setName(makirDTO.getName());
            makirService.save(makir);
            return ResponseEntity.ok("updated");
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {

        if (id != null) {


            makirService.deleteById(id);
            return ResponseEntity.ok("deleted");
        }
        return ResponseEntity.notFound().build();


    }
}
