package com.mongo.MongoSpringBoot.model.request;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryRequest {
    private String code;
    private String description;
}
