package com.ecp.ecommerceproject.DDD.api.mapper;


import com.ecp.ecommerceproject.DDD.api.DTO.Response.ProductDTO;
import com.ecp.ecommerceproject.DDD.domain.model.Product;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class ProductDTOMapper {

// Add i update jedna metoda, release mozna zrobic z frontu


    public ProductDTO mapToDTO(Product product){
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getQuantityAvailable(),
                product.getReleased()

        );
    }

    public Product mapToProduct (ProductDTO productUpdateDTO){
        return new Product (null,
                productUpdateDTO.getName(),
                productUpdateDTO.getReleased(),
                productUpdateDTO.getPrice(),
                productUpdateDTO.getDescription(),
                productUpdateDTO.getQuantityAvailable()
        );
    }

}
