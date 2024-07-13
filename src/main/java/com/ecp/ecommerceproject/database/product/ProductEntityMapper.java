package com.ecp.ecommerceproject.database.product;

import org.springframework.stereotype.Component;

import com.ecp.ecommerceproject.domain.model.Product;

import java.math.BigDecimal;

@Component
public class ProductEntityMapper {

    public ProductEntity mapToEntity (Product product){
        assert product.getPrice() != null;
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
