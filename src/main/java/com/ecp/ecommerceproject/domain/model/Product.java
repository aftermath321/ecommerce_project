package com.ecp.ecommerceproject.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.Nullable;

import java.math.BigDecimal;
import java.time.LocalDate;


@ToString
@AllArgsConstructor
@Setter
@Getter
public class Product {

// Czysta JAVA

//    Może być Long / Integer

    @Nullable
    private Long id;
    @Nullable
    private String name;
    @Nullable
    private LocalDate released;
    @Nullable
    private BigDecimal price;
    @Nullable
    private String description;
    @Nullable
    private long quantityAvailable;



}
