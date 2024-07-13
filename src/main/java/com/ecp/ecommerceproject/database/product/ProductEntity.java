package com.ecp.ecommerceproject.database.product;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Table(name = "product_entity")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Long quantityAvailable;

    private double price;

    private LocalDate released;

}
