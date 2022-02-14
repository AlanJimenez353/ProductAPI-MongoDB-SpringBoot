package com.mongo.MongoSpringBoot.repository;

import com.mongo.MongoSpringBoot.model.document.Product;
import com.mongo.MongoSpringBoot.model.request.ProductRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    Product findByCode(String code);

}
