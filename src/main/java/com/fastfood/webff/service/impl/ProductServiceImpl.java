package com.fastfood.webff.service.impl;

import com.fastfood.webff.entity.Product;

public class ProductServiceImpl {

    @Override
    public ProductResponse getById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Product not found"));

        return productMapper.toResponse(product);
    }

}
