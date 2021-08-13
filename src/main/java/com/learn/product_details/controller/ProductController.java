package com.learn.product_details.controller;

import com.learn.product_details.model.Product;
import com.learn.product_details.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product postProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> postProducts(@RequestBody List<Product> products) {
        return service.addProducts(products);
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id) {
        return service.findProductById(id);
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.findProducts();
    }

    @GetMapping("/productByName/{name}")
    public Product getProductByName(@PathVariable String name) {
        return service.findProductByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProductById(id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll() {
        return service.deleteProducts();
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }
}
