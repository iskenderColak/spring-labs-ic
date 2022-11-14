package com.icolak.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.icolak")
public class Config {

    @Bean
    Faker faker() {
        return new Faker();
    }
}
