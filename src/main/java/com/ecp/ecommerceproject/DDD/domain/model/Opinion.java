package com.ecp.ecommerceproject.DDD.domain.model;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Opinion {

    @Nullable
    private Long id;

    @Nullable
    private Long user_id;

    @Nullable
    private Long product_id;

    @Nullable
    private String content;

    @Nullable
    private Double rating;

    @Nullable
    private LocalDate create_at;

    @Nullable
    private LocalDate updated_at;

}
