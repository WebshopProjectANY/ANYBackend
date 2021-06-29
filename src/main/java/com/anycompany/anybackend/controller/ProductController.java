package com.anycompany.anybackend.controller;

import com.anycompany.anybackend.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {


    @GetMapping("/products")
    public Product getProducts() {
        // todo: return list of all products
        return null;
    }

/*    @GetMapping("/category/{categoryName}")
    public Product getProductsOfCategory() {
        // todo: return list of products for a specific category
        return null;
    }*/

    @PostMapping("/products/")
    public Product createProduct(@RequestBody Product product) {
        // todo: adds a new product to a list of products
        return null;
    }

    @GetMapping("/products/{productId}")
    public Product getProductInfo(@PathVariable int productId) {
        // todo: get info for a specific product
        return null;
    }

    @PutMapping("/products/{productId}")
    public Product changeProductInfo(@PathVariable int productId) {
        // todo: change attributes of a specific product
        return null;
    }

    @DeleteMapping("/products/{productId}")
    public Product removeProduct(@PathVariable int productId){
        // todo: delete specific product from database
        return null;
    }


/*
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
*/

}
