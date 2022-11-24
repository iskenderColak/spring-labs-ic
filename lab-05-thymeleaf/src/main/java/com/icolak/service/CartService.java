package com.icolak.service;


import com.icolak.model.Cart;

import java.util.UUID;

public interface CartService {
    Cart addToCart(UUID productId, Integer quantity);
    boolean deleteFromCart(UUID productId);
}
