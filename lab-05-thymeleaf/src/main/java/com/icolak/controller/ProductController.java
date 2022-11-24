package com.icolak.controller;

import com.icolak.model.Product;
import com.icolak.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/create-form")
    public String createProduct(Model model) {

        model.addAttribute("product", new Product());

        return "product/create-product";
    }

    @PostMapping("/insert")
    public String insertProduct(@ModelAttribute("product") Product product) {

        productService.productCreate(product);

        return "redirect:/list";
    }

    @GetMapping("/list")
    public String productList(Model model) {

        model.addAttribute("productList", productService.listProduct());

        return "/product/list";
    }
}
