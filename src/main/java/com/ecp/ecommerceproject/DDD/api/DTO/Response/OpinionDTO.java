package com.ecp.ecommerceproject.DDD.api.DTO.Response;

import jakarta.annotation.Nullable;

import java.time.LocalDate;

public class OpinionDTO {

    private Long user_id;

    private Long product_id;

    private String content;

    private Double rating;

    private LocalDate create_at;

    private LocalDate updated_at;

}
