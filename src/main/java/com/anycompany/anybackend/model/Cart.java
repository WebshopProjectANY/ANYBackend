package com.anycompany.anybackend.model;

import java.util.ArrayList;
import java.util.Date;

public class Cart {
    private final User user;
    private ArrayList<Product> productList;
    private String shippingAddress;
    private double priceTotal;
    private Date dateOfOrder;

    public Cart(User user, ArrayList<Product> productList, double priceTotal) {
        this.user = user;
        this.productList = productList;
        this.priceTotal = priceTotal;
    }

    public Cart(User user, ArrayList<Product> productList, String shippingAddress, double priceTotal, Date dateOfOrder) {
        this.user = user;
        this.productList = productList;
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

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
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
