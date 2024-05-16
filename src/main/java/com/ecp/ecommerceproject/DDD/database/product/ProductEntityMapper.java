package com.ecp.ecommerceproject.DDD.database.product;

import org.springframework.stereotype.Component;

import com.ecp.ecommerceproject.DDD.domain.model.Product;

import java.math.BigDecimal;
import java.util.Optional;

@Component
public class ProductEntityMapper {

    public ProductEntity mapToEntity (Product product){
        return new ProductEntity(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getQuantityAvailable(),
                product.getPrice().doubleValue(),
                product.getReleased()
        );
    }

    public Product mapToProduct (ProductEntity productEntity){

        return new Product (
                productEntity.getId(),
                productEntity.getName(),
                productEntity.getReleased(),
                BigDecimal.valueOf(productEntity.getPrice()),
                productEntity.getDescription(),
                productEntity.getQuantityAvailable()
                );
    }


}
