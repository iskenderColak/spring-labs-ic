package com.icolak.service;

import com.icolak.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProduct(String name);

    void initialiseProductList();
}
