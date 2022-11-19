package com.icolak;

import com.icolak.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab04SpringmvcApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Lab04SpringmvcApplication.class, args);
        ProductService productService = context.getBean(ProductService.class);
        productService.initialiseProductList();
    }

}
