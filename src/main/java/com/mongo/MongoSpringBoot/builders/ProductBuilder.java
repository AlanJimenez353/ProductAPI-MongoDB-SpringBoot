package com.mongo.MongoSpringBoot.builders;

import com.mongo.MongoSpringBoot.model.document.Product;
import com.mongo.MongoSpringBoot.model.request.ProductRequest;
import com.mongo.MongoSpringBoot.model.response.ProductResponse;

import java.time.LocalDateTime;

public class ProductBuilder {

    public static Product requestToDocumentCreate(ProductRequest request) {
        return Product.builder()
                .code(request.getCode())
                .description(request.getDescription())
                .price(request.getPrice())
                .category(CategoryBuilder.requestToDocument(request.getCategory()))
                .creationDate(LocalDateTime.now())
                .status(Boolean.TRUE)
                .build();
    }

    public static Product requestToDocumentUpdate(ProductRequest request) {
        return Product.builder()
                .code(request.getCode())
                .description(request.getDescription())
                .price(request.getPrice())
                .category(CategoryBuilder.requestToDocument(request.getCategory()))
                .modificationDate(LocalDateTime.now())
                .build();
    }

    public static ProductResponse documentToResponseCreate(Product document) {
        return ProductResponse.builder()
                .code(document.getCode())
                .creationDate(document.getCreationDate())
                .modificationDate(document.getModificationDate())
                .status(document.isStatus())
                .build();
    }

    public static ProductResponse documentToResponseSearch(Product document) {
        return ProductResponse.builder()
                .code(document.getCode())
                .description(document.getDescription())
                .category(CategoryBuilder.documentToResponse(document.getCategory()))
                .price(document.getPrice())
                .creationDate(document.getCreationDate())
                .modificationDate(document.getModificationDate())
                .status(document.isStatus())
                .build();
    }
}
