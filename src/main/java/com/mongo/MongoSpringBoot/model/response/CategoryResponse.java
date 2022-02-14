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
public class CategoryResponse {

    private String code;
    private String description;
    private boolean status;
    private LocalDateTime creationDate;
    private LocalDateTime modificationDate;
}

