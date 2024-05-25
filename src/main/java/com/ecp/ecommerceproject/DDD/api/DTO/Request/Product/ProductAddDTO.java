package com.ecp.ecommerceproject.DDD.api.DTO.Request.Product;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class ProductAddDTO {

    private String name;
    private String description;
    private BigDecimal price;
    private Long quantityAvailable;

    public ProductAddDTO(String name, String description, BigDecimal price, Long quantityAvailable) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

}
