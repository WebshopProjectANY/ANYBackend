package com.anycompany.anybackend.controller;

import com.anycompany.anybackend.model.Category;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {

    @GetMapping("/category")
    public Category getCategories() {
        // todo: return list of categories as JSON
        return null;
    }

    @PostMapping("/category/")
    public Category createCategory(@RequestBody Category category) {
        // todo: adds a new category to a list of categories
        return null;
    }

    @GetMapping("/category/{categoryId}")
    public Category getCategoryInfo(@PathVariable int categoryId) {
        // todo: get info (& products ?) for a specific category
        return null;
    }

    @PutMapping("/category/{categoryId}")
    public Category changeCategoryInfo(@PathVariable int categoryId) {
        // todo: change attributes of a specific category
        return null;
    }

    @DeleteMapping("/category/{categoryId}")
    public Category removeCategory(@PathVariable int categoryId){
        // todo: delete specific category from database
        return null;
    }


    /*
    public Category getDemoCategory(String catName) {
        return new Category(1, capitalize(catName), "Insert Produktkategorie description here!");
    }

    private String capitalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
*/


}