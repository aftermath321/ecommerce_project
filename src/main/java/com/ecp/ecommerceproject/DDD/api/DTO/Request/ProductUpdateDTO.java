package com.ecp.ecommerceproject.DDD.api.DTO.Request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class ProductUpdateDTO {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Long quantityAvailable;


    public ProductUpdateDTO(Long id, String name, String description, BigDecimal price, Long quantityAvailable) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }
}
