package com.anycompany.anybackend.controller;

import com.anycompany.anybackend.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {


    @GetMapping("/products")
    // 19.11.21 - von Lukas gezeigt wie man in Controller (nicht richtig, sollte repository nutzen) Produkte returned
    public List<Product> getProducts() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("product1", 0, 12, "url", null, "test"));
        products.add(new Product("product2", 1, 100, "url", null, "test2"));
        products.add(new Product("product3", 2, 600, "url", null, "test2"));
        // todo: return list of all products with actual database
        return products;
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
        // 19.11.21 - von Lukas gezeigt wie man spezifische productId = List index bekommt
        // todo: get info for a specific product from database/service
        return getProducts().get(productId);
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
