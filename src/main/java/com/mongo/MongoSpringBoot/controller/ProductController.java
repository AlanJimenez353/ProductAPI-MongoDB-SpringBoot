package com.mongo.MongoSpringBoot.controller;

import com.mongo.MongoSpringBoot.model.Product;
import com.mongo.MongoSpringBoot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ecommerce")
public class ProductController {
    @Autowired
    ProductService service;

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return service.createProduct(product);
    }

    @GetMapping("/products/all")
    public List<Product> findProducts() {
        return service.findAll();
    }

    @GetMapping("/product")
    public Product findByName(@RequestParam String nombre) {
        return service.findByName(nombre);
    }

    @GetMapping("/productGreaters")
    public List<Product> findProductByPriceGreeater(@RequestParam int price) {
        return service.findByPriceGreaterThan(price);
    }

    @GetMapping("/product/all")
    public List<Product> findAllByCategoriaSortedByAge(
            @RequestParam String category,
            @RequestParam String orderBy,
            @RequestParam int limit) {
        return service.findAllByCategorySortedLimit(category, orderBy, limit);
    }

}
