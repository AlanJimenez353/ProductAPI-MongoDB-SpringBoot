package com.mongo.MongoSpringBoot.repository;

import com.mongo.MongoSpringBoot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductTemplateImp implements ProductTemplateRepository {

    @Autowired
    MongoTemplate template;

    @Override
    public List<Product> findAllByCategorySortedLimit(String category, String orderBy, int limit) {
            var query = new Query();
            query.with(Sort.by(
                    orderBy.equalsIgnoreCase("DESC")
                            ? Sort.Order.desc("price")
                            : Sort.Order.asc("price")));
            query.limit(limit);
            query.addCriteria(Criteria.where("category").is(category));

            return template.find(query, Product.class);
        }

}

