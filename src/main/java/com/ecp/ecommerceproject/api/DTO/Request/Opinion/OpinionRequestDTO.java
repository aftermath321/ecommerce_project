package com.ecp.ecommerceproject.api.DTO.Request.Opinion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class OpinionRequestDTO {

    private Long user_id;

    private Long product_id;

    private String content;

    private Double rating;

    private LocalDate create_at;

    private LocalDate updated_at;

}
