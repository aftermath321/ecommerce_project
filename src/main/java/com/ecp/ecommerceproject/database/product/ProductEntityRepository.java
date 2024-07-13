package com.ecp.ecommerceproject.database.product;

import com.ecp.ecommerceproject.domain.model.Product;
import com.ecp.ecommerceproject.domain.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

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
    public Product updateProduct(Product product) {
        ProductEntity productEntity = productEntityMapper.mapToEntity(product);
        productEntity = productEntityJPARepository.save(productEntity);
        return productEntityMapper.mapToProduct(productEntity);
    }

    @Override
    public void deleteProduct(Long id) {
        productEntityJPARepository.deleteById(id);
    }

    @Override
    public Optional<Product> getProduct(Long id) {
        Optional<ProductEntity> productEntityOptional = productEntityJPARepository.findById(id);
        return productEntityOptional.map(productEntityMapper::mapToProduct);
    }

    @Override
    public long countItems(){
        return productEntityJPARepository.count();
    }


    @Override
    public List<Product> getAllProducts(int page, int size, String filterByNameOrDescription) {

        Pageable pageable = PageRequest.of(page, size);
        Page<ProductEntity> productEntityPage = productEntityJPARepository.findAll(filterByNameOrDescription, pageable);

        return productEntityPage.stream().map(productEntityMapper::mapToProduct).collect(Collectors.toList());
    }
}
