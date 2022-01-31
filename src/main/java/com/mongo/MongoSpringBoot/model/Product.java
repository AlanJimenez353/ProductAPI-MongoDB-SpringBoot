package com.mongo.MongoSpringBoot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("productos")
public class Product {

    @Id
    private Long id;
    private String name;
    private String category;
    private int price;
    private int stock;

    public Product(){};

    public Product(String name, String category, int stock,int price) {
        this.name = name;
        this.category = category;
        this.stock = stock;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void getName(String nombre){
        this.name = nombre;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String categoria){
        this.category = categoria;
    }

    public int getStock(){
        return stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
}
