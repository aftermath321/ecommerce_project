package com.ecp.ecommerceproject.api.DTO.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
public class OpinionResponseDTO {

    private Long user_id;

    private Long product_id;

    private String content;

    private Double rating;

    private LocalDate create_at;

    private LocalDate updated_at;

}
