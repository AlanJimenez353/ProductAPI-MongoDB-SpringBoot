package com.mongo.MongoSpringBoot.service;

import com.mongo.MongoSpringBoot.model.document.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    Product findByName(String name);
    List<Product> findAll();

    List<Product> findAllByCategorySortedLimit(String category, String orderBy, int limit);
    List<Product> findByPriceGreaterThan(int price);
}