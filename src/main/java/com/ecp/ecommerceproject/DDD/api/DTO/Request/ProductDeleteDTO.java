package com.ecp.ecommerceproject.DDD.api.DTO.Request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@ToString
public class ProductDeleteDTO {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Long quantityAvailable;
    private LocalDate released;


    public ProductDeleteDTO(Long id, String name, String description, BigDecimal price, Long quantityAvailable, LocalDate released) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
        this.released = released;
    }
}
