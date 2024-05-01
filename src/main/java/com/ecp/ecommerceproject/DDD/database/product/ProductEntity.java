package com.ecp.ecommerceproject.DDD.database.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private Long quantityAvailable;

    @Column
    private double price;

    @Column
    private LocalDate released;

    public ProductEntity(String name, String description, Long quantityAvailable,  double price, LocalDate released) {
        this.name = name;
        this.description = description;
        this.quantityAvailable = quantityAvailable;
        this.price = price;
        this.released = released;
    }
}
