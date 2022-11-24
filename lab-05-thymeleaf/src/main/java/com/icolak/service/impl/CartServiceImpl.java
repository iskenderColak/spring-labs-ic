package com.icolak.service.impl;

import com.icolak.model.Cart;
import com.icolak.model.CartItem;
import com.icolak.model.Product;
import com.icolak.repository.ProductRepository;
import com.icolak.service.CartService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;

@Service
public class CartServiceImpl implements CartService {

    public static Cart CART = new Cart(BigDecimal.ZERO,new ArrayList<>());

    private final ProductRepository productRepository;

    public CartServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Cart addToCart(UUID productId, Integer quantity) {
        //todo retrieve product from repository method
        Product product = productRepository.findProductById(productId);
        //todo initialize cart item
        CartItem cartItem = new CartItem();
        cartItem.setProduct(product);
        cartItem.setQuantity(quantity);
        cartItem.setTotalAmount(product.getPrice().multiply(BigDecimal.valueOf(quantity)));
        //todo add to cart
        CART.getCartItemList().add(cartItem);
        //todo calculate cart total amount
        CART.setCartTotalAmount(CART.getCartTotalAmount().add(cartItem.getTotalAmount()));

        return CART;
    }

    @Override
    public boolean deleteFromCart(UUID productId) {
        //todo delete product object from cart using stream
        CartItem itemToDelete = CART.getCartItemList().stream()
                .filter(cartItem -> cartItem.getProduct().getId().equals(productId))
                .findFirst().orElseThrow();
        CART.setCartTotalAmount(CART.getCartTotalAmount().subtract(itemToDelete.getTotalAmount()));
        return CART.getCartItemList().remove(itemToDelete);
    }

}
