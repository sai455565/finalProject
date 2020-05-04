/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproject.bean;

/**
 *
 * @author saitejaadabala
 */
public class orderItem {
    
    private int     orderNumber;
    private int     lineNumber;
    private int     prodcutId;
    private String  productDescription;
    private int     qty;
    private double  price;

    public orderItem(int orderNumber, int lineNumber, int prodcutId, String productDescription, int qty, double price) {
        this.orderNumber = orderNumber;
        this.lineNumber = lineNumber;
        this.prodcutId = prodcutId;
        this.productDescription = productDescription;
        this.qty = qty;
        this.price = price;
    }

    @Override
    public String toString() {
        return "orderItem{" + "orderNumber=" + orderNumber + ", lineNumber=" + lineNumber + ", prodcutId=" + prodcutId + ", productDescription=" + productDescription + ", qty=" + qty + ", price=" + price + '}';
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getProdcutId() {
        return prodcutId;
    }

    public void setProdcutId(int prodcutId) {
        this.prodcutId = prodcutId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
