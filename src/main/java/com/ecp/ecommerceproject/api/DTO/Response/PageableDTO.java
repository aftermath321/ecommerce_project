package com.ecp.ecommerceproject.api.DTO.Response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class PageableDTO {

    private long itemCount;
    private List<?> DTOList;

}
