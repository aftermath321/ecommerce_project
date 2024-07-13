package com.ecp.ecommerceproject.database.opinion;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "opinion_entity")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OpinionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "product_id", nullable = false)
    private Long productId;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Double rating;

    private LocalDate create_at;

    private LocalDate updated_at;

}
