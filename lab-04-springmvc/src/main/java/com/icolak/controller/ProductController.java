package com.icolak.controller;

import com.icolak.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

/* // @RequestParam
    @RequestMapping("/search-product")
    public String showProduct(@RequestParam String name, Model model) {

        model.addAttribute("productList", productService.searchProduct(name));

        return "/product/product-list";
    }
*/

    @RequestMapping("/search-product/{name}")
    public String showProduct(@PathVariable String name, Model model) {

        model.addAttribute("productList", productService.searchProduct(name));

        return "/product/product-list";
    }
}
