package com.mongo.MongoSpringBoot.model.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("productos")
public class Product {

    @Id
    private String id;
    private boolean status;
    private String code;
    private String description;
    private Double price;
    private LocalDateTime creationDate;
    private LocalDateTime modificationDate;
    //private Category category;

}
