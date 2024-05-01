package com.ecp.ecommerceproject.DDD.api.mapper;

import com.ecp.ecommerceproject.DDD.api.DTO.Request.ProductAddDTO;
import com.ecp.ecommerceproject.DDD.api.DTO.Response.ProductDTO;
import com.ecp.ecommerceproject.DDD.domain.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductDTOMapper {

    public Product mapToProduct (ProductAddDTO productAddDTO){
        return new Product (
                productAddDTO.getName(),
                productAddDTO.getPrice(),
                productAddDTO.getDescription(),
                productAddDTO.getQuantityAvailable()
        );
    }

    public ProductDTO mapToDTO(Product product){
        return new ProductDTO(
                product.getId().longValue(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getQuantityAvailable()

        );
    }

}
