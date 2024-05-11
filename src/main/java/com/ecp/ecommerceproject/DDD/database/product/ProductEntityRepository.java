package com.ecp.ecommerceproject.DDD.database.product;

import org.springframework.stereotype.Repository;

import com.ecp.ecommerceproject.DDD.domain.model.Product;
import com.ecp.ecommerceproject.DDD.domain.repository.ProductRepository;

import lombok.AllArgsConstructor;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
    @Override
    public List<Product> getAllProducts(){
        List<ProductEntity> productList = productEntityJPARepository.findAll();
        return productList.stream()
                .map(productEntityMapper::mapToProduct)
                .collect(Collectors.toList());
    }



    @Override
    public Product updateProduct(Product product) {
        System.out.println(product);
        ProductEntity productEntity = productEntityMapper.mapToUpdateEntity(product);
        System.out.println(productEntity);
        productEntity = productEntityJPARepository.save(productEntity);
        System.out.println(productEntity);
        return productEntityMapper.mapToProduct(productEntity);


    }

    @Override
    public void deleteProduct(Product product) {
        ProductEntity productEntity = productEntityMapper.mapToDeleteEntity(product);
        productEntityJPARepository.delete(productEntity);
        System.out.println(productEntity);
    }

    ;

}
