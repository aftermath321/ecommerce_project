package com.ecp.ecommerceproject.DDD.database.opinion;

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

    @Column(nullable = false)
    private Long user_id;

    @Column(nullable = false)
    private Long product_id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Double rating;

    private LocalDate created_at;

    private LocalDate updated_at;

}
