package com.ecp.ecommerceproject.DDD.api.DTO.Request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class ProductDeleteDTO {


    private String name;
    private String description;
    private BigDecimal price;
    private Long quantityAvailable;

    public ProductDeleteDTO(String name, String description, BigDecimal price, Long quantityAvailable) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }
}
