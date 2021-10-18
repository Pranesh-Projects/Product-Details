package com.learn.product_details.Product.configuration;

import com.learn.product_details.Product.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository repository) {
        return args -> {

        };
    }
}
