package com.ecp.ecommerceproject.api.mapper;


import com.ecp.ecommerceproject.api.DTO.Request.Product.ProductRequestDTO;
import com.ecp.ecommerceproject.api.DTO.Response.ProductResponseDTO;
import com.ecp.ecommerceproject.domain.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductDTOMapper {

// Add i update jedna metoda, release mozna zrobic z frontu


    public ProductResponseDTO mapToDTO(Product product){
        return new ProductResponseDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getQuantityAvailable(),
                product.getReleased()

        );
    }

    public Product mapToProduct (ProductRequestDTO productRequestDTO){
        return new Product (null,
                productRequestDTO.getName(),
                productRequestDTO.getReleased(),
                productRequestDTO.getPrice(),
                productRequestDTO.getDescription(),
                productRequestDTO.getQuantityAvailable()
        );
    }

}
