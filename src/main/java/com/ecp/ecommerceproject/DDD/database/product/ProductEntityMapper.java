package com.ecp.ecommerceproject.DDD.database.product;

import org.springframework.stereotype.Component;

import com.ecp.ecommerceproject.DDD.domain.model.Product;

import java.math.BigDecimal;

@Component
public class ProductEntityMapper {

    public ProductEntity mapToEntity (Product product){
        return new ProductEntity(
                product.getName(),
                product.getDescription(),
                product.getQuantityAvailable(),
                product.getPrice().doubleValue(),
                product.getReleased()
        );
    }

    public Product mapToProduct (ProductEntity productEntity){

        return new Product (
                (int) (productEntity.getId()).longValue(),
                productEntity.getName(),
                BigDecimal.valueOf(productEntity.getPrice()),
                productEntity.getDescription(),
                productEntity.getQuantityAvailable()
                );
    }

}
