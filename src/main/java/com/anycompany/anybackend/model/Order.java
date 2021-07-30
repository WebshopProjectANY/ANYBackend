package com.anycompany.anybackend.model;

public class Order {
    private final User user;
    private Product[] products;
    private int amountOfThisProduct;
    private int totalPrice;

    public Order(User user, Product[] products, int amountOfThisProduct, int totalPrice) {
        this.user = user;
        this.products = products;
        this.amountOfThisProduct = amountOfThisProduct;
        this.totalPrice = totalPrice;
    }

    public User getUser() {
        return user;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getAmountOfThisProduct() {
        return amountOfThisProduct;
    }

    public void setAmountOfThisProduct(int amountOfThisProduct) {
        this.amountOfThisProduct = amountOfThisProduct;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
