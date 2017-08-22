package ua.com.owu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.dao.ProductDAO;
import ua.com.owu.entity.Product;
import ua.com.owu.service.ProductSrvice;

import java.util.List;

@Service
@Transactional
public class ProductServiceImp implements ProductSrvice {

    @Autowired
    ProductDAO productDAO;
    public void save(String productName) {
        Product product = new Product(productName);
        productDAO.save(product);
    }

    public void save(Product product) {
        productDAO.save(product);
    }

    public Product findOne(int id) {
        return productDAO.findOne(id);
    }

    public List<Product> findAll() {
        return productDAO.findAll();
    }
}
