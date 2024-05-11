package com.ecp.ecommerceproject.DDD.domain.model;

import com.ecp.ecommerceproject.domain.valueobjects.Rating;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@ToString
public class Product {
// Czysta JAVA
    private Integer id;
    @Setter
    private String name;
    @Setter
    private LocalDate released;
    @Setter
    private BigDecimal price;
    @Setter
    private String description;
    @Setter
    private Long quantityAvailable;

    public Product(String name, BigDecimal price, String description, Long quantityAvailable) {
        this.name = name;
        this.released = LocalDate.now();
        this.price = price;
        this.description = description;
        this.quantityAvailable = quantityAvailable;
    }

    public Product(Integer id, String name, BigDecimal price, String description, Long quantityAvailable) {
        this.id = id;
        this.name = name;
        this.released = LocalDate.now();
        this.price = price;
        this.description = description;
        this.quantityAvailable = quantityAvailable;
    }

    public Product(Integer id, String name, BigDecimal price, String description, Long quantityAvailable, LocalDate released) {
        this.id = id;
        this.name = name;
        this.released = released;
        this.price = price;
        this.description = description;
        this.quantityAvailable = quantityAvailable;
    }



}
