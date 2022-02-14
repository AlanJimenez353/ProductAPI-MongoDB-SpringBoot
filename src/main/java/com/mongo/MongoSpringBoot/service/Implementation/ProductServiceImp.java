package com.mongo.MongoSpringBoot.service.Implementation;

import com.mongo.MongoSpringBoot.builders.ProductBuilder;
import com.mongo.MongoSpringBoot.model.document.Product;
import com.mongo.MongoSpringBoot.model.exceptions.ApiRestException;
import com.mongo.MongoSpringBoot.model.request.ProductRequest;
import com.mongo.MongoSpringBoot.model.response.ProductResponse;
import com.mongo.MongoSpringBoot.repository.CategoryRepository;
import com.mongo.MongoSpringBoot.repository.ProductRepository;
import com.mongo.MongoSpringBoot.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
@RequiredArgsConstructor
public class ProductServiceImp implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;


    @Override
    public ProductResponse create(ProductRequest request) throws ApiRestException {
        validateRequestCreate(request);
        var document = productRepository.save(ProductBuilder.requestToDocumentCreate(request));
        return ProductBuilder.documentToResponseCreate(document);
    }
    @Override
    public List<Product> getAll() {
        return null;
    }


    private void validateRequestCreate(ProductRequest request) throws ApiRestException {
        var category = categoryRepository.findByCode(request.getCategory().getCode());
        var product = productRepository.findByCode(request.getCode());

        if (Objects.isNull(category)) {
            throw new ApiRestException("La categoria no existe");
        }
        if (!Objects.isNull(product)) {
            throw new ApiRestException("El producto ya existe");
        }
    }

}
