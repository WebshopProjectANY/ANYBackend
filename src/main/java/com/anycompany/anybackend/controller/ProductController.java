package com.anycompany.anybackend.controller;

import com.anycompany.anybackend.model.Category;
import com.anycompany.anybackend.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/{categoryName}/{productName}")
    public Product getProduct(@PathVariable String categoryName, @PathVariable String productName){
        return getDemoProduct(categoryName, productName);
    }

    private Product getDemoProduct(String categoryName, String productName) {
        return new Product (productName, 1, 99.90, "bestImage.jpg",
                new Category(1, categoryName,
                        "Insert Produktkategorie description here!"),
                "you should buy this product. NOW!");
    }
}
