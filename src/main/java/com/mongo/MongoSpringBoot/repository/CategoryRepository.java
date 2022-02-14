package com.mongo.MongoSpringBoot.repository;

import com.mongo.MongoSpringBoot.model.document.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository {
    Category findByCode(String code);
}

