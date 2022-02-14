package com.mongo.MongoSpringBoot.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductResponse {

    private String code;
    private boolean status;
    private Double price;
    private String description;
    private LocalDateTime creationDate;
    private LocalDateTime modificationDate;
    private CategoryResponse category;

}
