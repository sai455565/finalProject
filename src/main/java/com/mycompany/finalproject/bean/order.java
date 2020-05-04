/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproject.bean;

import java.util.Date;

/**
 *
 * @author saitejaadabala
 */
public class order {
     
    private int         orderNumber;
    private int         customerId;
    private String      date;

    public order(int orderNumber, int customerId, String date) {
        this.orderNumber = orderNumber;
        this.customerId = customerId;
        this.date = date;
    }

    
    @Override
    public String toString() {
        return "order{" + "orderNumber=" + orderNumber + ", customerId=" + customerId + ", date=" + date + '}';
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
