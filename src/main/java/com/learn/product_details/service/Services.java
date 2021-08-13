package com.learn.product_details.service;

import com.learn.product_details.model.Product;
import com.learn.product_details.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services {
    @Autowired
private ProductRepository repository;

    public Product addProduct(Product product){
        return repository.save(product);
    }
    public List<Product> addProducts(List<Product> products){
        return repository.saveAll(products);
    }
    public Product findProductById(int id){
        return repository.findById(id).orElse(null);
    }
    public Product findProductByName(String name){
        return repository.findByName(name);
    }
public List<Product> findProducts(){
        return repository.findAll();
}
public String deleteProductById(int id){
        repository.deleteById(id);
        return id + "Product Removed!";
}
public String deleteProducts(){
        repository.deleteAll();
        return "All Deleted";
}
public Product updateProduct(Product product){
Product existing = repository.findById(product.getId()).orElse(null);
existing.setName(product.getName());
existing.setPrice(product.getPrice());
existing.setQuantity(product.getQuantity());
return existing;
}

}
