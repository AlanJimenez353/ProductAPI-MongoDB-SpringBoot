package com.mongo.MongoSpringBoot.repository;

import com.mongo.MongoSpringBoot.model.Product;

import java.util.List;


public interface ProductTemplateRepository {

    List<Product> findAllByCategorySortedLimit(String category, String orderBy, int limit);
}