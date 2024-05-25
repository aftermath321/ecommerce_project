package com.ecp.ecommerceproject.DDD.domain.service;

import com.ecp.ecommerceproject.DDD.api.DTO.Response.ProductDTO;
import com.ecp.ecommerceproject.DDD.api.mapper.ProductDTOMapper;
import com.ecp.ecommerceproject.DDD.domain.model.Product;
import com.ecp.ecommerceproject.DDD.domain.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProductService {

//    Dobre miejsce na logike biznesowa

    private ProductRepository productRepository;
    private ProductDTOMapper productDTOMapper;

    public Product addProduct(Product product) {
        return productRepository.saveProduct(product);
    }

    public Page<ProductDTO> getAllProducts(Pageable pageRequest) {
        List<Product> productList = productRepository.getAllProducts(pageRequest);

        List<ProductDTO> productDTOList = productList.stream().map(productDTOMapper::mapToDTO).toList();
        System.out.println(productDTOList);
        return new PageImpl<>(productDTOList);
    }


    //    Oblsuga exception
    public Product updateProduct(Long id, Product product) {
        Optional<Product> oldProduct = productRepository.getProduct(id);
//        Product oldProduct = productRepository.getProduct(id).orElseThrow()
        System.out.println(oldProduct);
        oldProduct.get().setDescription(product.getDescription());
        oldProduct.get().setName(product.getName());
        oldProduct.get().setPrice(product.getPrice());
        oldProduct.get().setQuantityAvailable(product.getQuantityAvailable());
        System.out.println(oldProduct);
        return productRepository.updateProduct(oldProduct.get());
    }

    public void deleteProduct(long id) {
        productRepository.deleteProduct(id);
    }

    public Optional<Product> getProduct(Long id) {
        return productRepository.getProduct(id);
    }
}
