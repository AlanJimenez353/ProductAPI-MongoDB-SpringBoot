package com.mongo.MongoSpringBoot.service;

import com.mongo.MongoSpringBoot.model.Product;
import com.mongo.MongoSpringBoot.repository.ProductRepository;
import com.mongo.MongoSpringBoot.repository.ProductTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements ProductService {
    @Autowired
    private ProductRepository repository;
    @Autowired
    private ProductTemplateRepository template;

    @Override
    public Product createProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public Product findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }
    @Override
    public List<Product> findAllByCategorySortedLimit(String category, String orderBy, int limit) {
        return template.findAllByCategorySortedLimit(category, orderBy, limit);
    }
    @Override
    public List<Product>findByPriceGreaterThan(int price) {
        return repository.findByPriceGreaterThan(price);
    }



}
