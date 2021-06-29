package com.anycompany.anybackend.model;

import java.util.Date;

public class Cart {
    private User user;
    private int userId;
    private Product[] products;
    private String shippingAddress;
    private double priceTotal;
    private Date dateOfOrder;

    public Cart(User user, Product[] products, double priceTotal) {
        this.user = user;
        this.userId = getUserId();
        this.products = products;
        this.priceTotal = priceTotal;
    }

    public Cart(User user, Product[] products, String shippingAddress, double priceTotal, Date dateOfOrder) {
        this.user = user;
        this.userId = getUserId();
        this.products = products;
        this.shippingAddress = shippingAddress;
        this.priceTotal = priceTotal;
        this.dateOfOrder = dateOfOrder;
    }

    public User getUser() {
        return user;
    }

/*    public void setUser(User user) {
        this.user = user;
    }*/

    public int getUserId() {
        return user.getUserId();
    }

/*    public void setUserId(int userId) {
        this.userId = userId;
    }*/

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public double getPriceTotal() {
        return priceTotal;
    }

    public void setPriceTotal(double priceTotal) {
        this.priceTotal = priceTotal;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }
}
