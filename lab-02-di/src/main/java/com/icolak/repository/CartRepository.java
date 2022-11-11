package com.icolak.repository;

import com.icolak.model.Product;

public interface CartRepository {
    boolean addCartDatabase(Product product, int quantity);
}
