package com.icolak.controller;

import com.icolak.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@Controller
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @RequestMapping("/cart-list")
    public String showCartList(Model model) {

        model.addAttribute("cartList", cartService.retrieveCartList());

        return "cart/cart-list";
    }

    @RequestMapping("/cart-list/{id}")
    public String showCartDetails(@PathVariable UUID id, Model model) {

        model.addAttribute("cartItemList", cartService.retrieveCartDetail(id));

        return "cart/cart-detail";
    }
}
