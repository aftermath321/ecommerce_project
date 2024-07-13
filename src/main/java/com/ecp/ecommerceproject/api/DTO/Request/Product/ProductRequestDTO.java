package com.ecp.ecommerceproject.api.DTO.Request.Product;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
public class ProductRequestDTO {

    private String name;
    private String description;
    private BigDecimal price;
    private Long quantityAvailable;
    private LocalDate released;


    public ProductRequestDTO(Long id, String name, String description, BigDecimal price, Long quantityAvailable, LocalDate released) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
        this.released = released;
    }
}
