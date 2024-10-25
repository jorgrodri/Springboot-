package com.negocio.tienda.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level =AccessLevel.PRIVATE )
@Entity
@Table(name = "fabricante")
public class Makir {


     @Id
     @GeneratedValue (strategy =  GenerationType.IDENTITY)
     Long id;

     @Column(name = "nombre")
     String name;
    

     @OneToMany(mappedBy = "makir", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
     @JsonIgnore
     private List<Product> productosList = new ArrayList<>();

}
