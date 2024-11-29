package com.java.cloud.fullstackshopweb.services;

import com.java.cloud.fullstackshopweb.entities.Product;
import com.java.cloud.fullstackshopweb.repository.ProductRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepositoy productRepositoy;

    public List<Product> findAll() {
        return productRepositoy.findAll();
    }

    public Product findById(Integer id) {
        return productRepositoy.findById(id).orElse(null);
    }

    public Product save(Product product) {
        return productRepositoy.save(product);
    }

    public Product update(Product product) {
        return productRepositoy.save(product);
    }

    public void delete(Integer id) {
        productRepositoy.deleteById(id);
    }

    public List<Product> searchByName(String name) {
        return productRepositoy.searchByName(name);
    }
}
