package com.anycompany.anybackend.model;public class Cart {
package com.anycompany.anybackend.model;

import java.util.Date;

public class Cart {
    private int cartId;
    //private User user;
    private Product[] products;
    private String shippingAddress;
    private double priceTotal;
    private Date dateOfOrder;

    public Cart(int cartId, Product[] products, double priceTotal) {
        this.cartId = cartId;
        this.products = products;
        this.priceTotal = priceTotal;
    }

    public Cart(int cartId, Product[] products, String shippingAddress, double priceTotal, Date dateOfOrder) {
        this.cartId = cartId;
        this.products = products;
        this.shippingAddress = shippingAddress;
        this.priceTotal = priceTotal;
        this.dateOfOrder = dateOfOrder;
    }
}
