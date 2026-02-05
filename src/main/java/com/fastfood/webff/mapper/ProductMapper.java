package com.fastfood.webff.mapper;

import org.springframework.stereotype.Component;

import com.fastfood.webff.dto.response.ProductResponse;
import com.fastfood.webff.entity.Product;

@Component
public class ProductMapper {

    public ProductResponse toResponse(Product product) {
        return new ProductResponse(
            product.getId(),
            product.getName(),
            product.getPrice()
        );
    }
}
