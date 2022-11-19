
package com.icolak.service;

import com.icolak.model.Cart;
import com.icolak.model.CartItem;

import java.util.List;
import java.util.UUID;

public interface CartService {
    List<Cart> retrieveCartList();

    List<CartItem> retrieveCartDetail(UUID cartId);

    void initialiseCartList();
}
