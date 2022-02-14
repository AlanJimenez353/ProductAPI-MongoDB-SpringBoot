package com.mongo.MongoSpringBoot.model.request;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
    private String code;
    private String description;
    private Double price;
    private CategoryRequest category;
}
