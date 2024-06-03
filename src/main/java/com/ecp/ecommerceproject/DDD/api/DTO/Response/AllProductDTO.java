package com.ecp.ecommerceproject.DDD.api.DTO.Response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class AllProductDTO {

    private long numberOfItemsInDB;
    private List<ProductDTO> productDTOList;

}
