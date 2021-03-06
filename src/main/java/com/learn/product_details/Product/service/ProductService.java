package com.learn.product_details.Product.service;

import com.learn.product_details.Product.model.Product;
import com.learn.product_details.Product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product addProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> addProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public Product findProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Product findProductByName(String name) {
        return repository.findByName(name);
    }

    public List<Product> findProducts() {
        return repository.findAll();
    }

    public String deleteProductById(int id) {
        repository.deleteById(id);
        return "Product" + id + "Removed!";
    }

    public String deleteProducts() {
        repository.deleteAll();
        return "All Deleted";
    }

    public Product updateProduct(Product product) {
        Product existing = repository.findById(product.getId()).orElse(null);
        assert existing != null;
        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
        existing.setQuantity(product.getQuantity());
        return repository.save(existing);
    }

}
