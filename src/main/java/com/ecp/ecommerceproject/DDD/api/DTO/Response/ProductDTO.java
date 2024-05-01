package com.ecp.ecommerceproject.DDD.api.DTO.Response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Long quantityAvailable;

    public ProductDTO(Long id, String name, String description, BigDecimal price, Long quantityAvailable) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }
}
