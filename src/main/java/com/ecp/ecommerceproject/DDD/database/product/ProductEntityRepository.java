package com.ecp.ecommerceproject.DDD.database.product;

import org.springframework.stereotype.Repository;

import com.ecp.ecommerceproject.DDD.domain.model.Product;
import com.ecp.ecommerceproject.DDD.domain.repository.ProductRepository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class ProductEntityRepository implements ProductRepository {

    private final ProductEntityMapper productEntityMapper;
    private final ProductEntityJPARepository productEntityJPARepository;


    @Override
    public Product saveProduct(Product product) {
        ProductEntity productEntity = productEntityMapper.mapToEntity(product);
        productEntity = productEntityJPARepository.save(productEntity);
        return productEntityMapper.mapToProduct(productEntity);
    }

}
