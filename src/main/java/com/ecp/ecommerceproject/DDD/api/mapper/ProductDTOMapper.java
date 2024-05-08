package com.ecp.ecommerceproject.DDD.api.mapper;

import com.ecp.ecommerceproject.DDD.api.DTO.Request.ProductAddDTO;
import com.ecp.ecommerceproject.DDD.api.DTO.Request.ProductDeleteDTO;
import com.ecp.ecommerceproject.DDD.api.DTO.Request.ProductUpdateDTO;
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

    public Product mapToProduct (ProductUpdateDTO productUpdateDTO){
        return new Product (
                Math.toIntExact(productUpdateDTO.getId()),
                productUpdateDTO.getName(),
                productUpdateDTO.getPrice(),
                productUpdateDTO.getDescription(),
                productUpdateDTO.getQuantityAvailable()
        );
    }

    public Product mapToProduct (ProductDeleteDTO productDeleteDTO){
        return new Product (
                productDeleteDTO.getName(),
                productDeleteDTO.getPrice(),
                productDeleteDTO.getDescription(),
                productDeleteDTO.getQuantityAvailable()
        );
    }

}
