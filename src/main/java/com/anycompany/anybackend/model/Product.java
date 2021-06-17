package com.anycompany.anybackend.model;

public class Product {
    private String productName;
    private int productId;
    private double price;
    private String imageUrl;
    private Category productCategory;
    private String description;

    public Product(String productName, int productId, double price, String imageUrl, Category productCategory, String description) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.imageUrl = imageUrl;
        this.productCategory = productCategory;
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Category getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Category productCategory) {
        this.productCategory = productCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}//ende class
