package com.mycompany.finalproject.bean;

/**
 *
 * @author saitejadabala
 */
public class product {
    
    private int             productId;
    private String          description;
    private int             quantityOnHand;
    private double          price;

    public product(int productId, String description, int quantityOnHand, double price) {
        this.productId = productId;
        this.description = description;
        this.quantityOnHand = quantityOnHand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "product{" + "productId=" + productId + ", description=" + description + ", quantityOnHand=" + quantityOnHand + ", price=" + price + '}';
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
