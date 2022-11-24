package com.icolak.controller;

import com.icolak.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

import static com.icolak.service.impl.CartServiceImpl.CART;

@Controller
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/cart")
    public String retrieveCartList(Model model) {
        model.addAttribute("cart", CART);
        return "cart/show-cart";
    }

    @GetMapping("/addToCart/{id}/{quantity}")
    public String addToCart(@PathVariable UUID id, @PathVariable Integer quantity) {
        cartService.addToCart(id,quantity);
        return "redirect:/cart";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable UUID id) {
        cartService.deleteFromCart(id);
        return "redirect:/cart";
    }
}
