package ua.com.owu.service;

import ua.com.owu.entity.Product;

import java.util.List;

public interface ProductSrvice {
    void save(String productName);
    void save(Product product);
    Product findOne(int id);
    List<Product> findAll();
}
