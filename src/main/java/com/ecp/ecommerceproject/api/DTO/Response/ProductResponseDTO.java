package com.ecp.ecommerceproject.api.DTO.Response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class ProductResponseDTO {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Long quantityAvailable;
    private LocalDate released;

    public ProductResponseDTO(Long id, String name, String description, BigDecimal price, Long quantityAvailable, LocalDate released) {
        this.id = id;
        this.name = name;
        this.released = released;
        this.description = description;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }
}
