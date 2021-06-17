package com.anycompany.anybackend.controller;

import com.anycompany.anybackend.model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @GetMapping("/{categoryName}")
    public Category getCategory(@PathVariable String categoryName) {
        return getDemoCategory(categoryName);
    }

    public Category getDemoCategory(String catName) {
        return new Category(1, capitalize(catName), "Insert Produktkategorie description here!");
    }

    private String capitalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

}