package com.fastfood.webff.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fastfood.webff.dto.response.ResponseDTO;

public class ProductController {
    @GetMapping("/{id}")
    public ResponseDTO<ProductDTO> getProductById(@PathVariable Long id) {
        return ResponseDTO.success(productService.getById(id));
    }
}
