package com.icolak.service.impl;

import com.icolak.model.Product;
import com.icolak.repository.ProductRepository;
import com.icolak.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public boolean productCreate(Product product) {
        product.setId(UUID.randomUUID());
        return productRepository.save(product);
    }

    @Override
    public List<Product> listProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product findProductById(UUID uuid) {
        return productRepository.findProductById(uuid);
    }

}
