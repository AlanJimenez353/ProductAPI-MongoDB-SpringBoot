package com.mongo.MongoSpringBoot.service;

import com.mongo.MongoSpringBoot.model.document.Product;
import com.mongo.MongoSpringBoot.model.exceptions.ApiRestException;
import com.mongo.MongoSpringBoot.model.request.ProductRequest;
import com.mongo.MongoSpringBoot.model.response.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    ProductResponse create(ProductRequest product) throws ApiRestException;

    List<Product> getAll();

    //Product findByName(String name);
    //List<Product> findAll();
    //List<Product> findAllByCategorySortedLimit(String category, String orderBy, int limit);
    //List<Product> findByPriceGreaterThan(int price);

}