package com.anycompany.anybackend.model;

public class Order {
    private final User user;
    private Product[] articles;
    private int amountArticles;
    private int totalPrice;

    public Order(User user, Product[] articles, int amountArticles, int totalPrice) {
        this.user = user;
        this.articles = articles;
        this.amountArticles = amountArticles;
        this.totalPrice = totalPrice;
    }

    public User getUser() {
        return user;
    }

    public Product[] getArticles() {
        return articles;
    }

    public void setArticles(Product[] articles) {
        this.articles = articles;
    }

    public int getAmountArticles() {
        return amountArticles;
    }

    public void setAmountArticles(int amountArticles) {
        this.amountArticles = amountArticles;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
