package com.ecp.ecommerceproject.DDD.api.mapper;

import com.ecp.ecommerceproject.DDD.api.DTO.Request.Product.ProductAddDTO;
import com.ecp.ecommerceproject.DDD.api.DTO.Request.Product.ProductUpdateDTO;
import com.ecp.ecommerceproject.DDD.api.DTO.Response.ProductDTO;
import com.ecp.ecommerceproject.DDD.domain.model.Product;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class ProductDTOMapper {

//
    public Product mapToProduct (ProductAddDTO productAddDTO){
        return new Product (
                null,
                productAddDTO.getName(),
                LocalDate.now(),
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

    public Product mapToProduct (Long id, ProductUpdateDTO productUpdateDTO){
        return new Product (id,
                productUpdateDTO.getName(),
                productUpdateDTO.getReleased(),
                productUpdateDTO.getPrice(),
                productUpdateDTO.getDescription(),
                productUpdateDTO.getQuantityAvailable()
        );
    }

}
