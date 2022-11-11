package com.icolak.service;

import com.icolak.model.Cart;
import com.icolak.model.Product;

public interface CartService {
    Cart addCart(Product product, int quantity);
}
