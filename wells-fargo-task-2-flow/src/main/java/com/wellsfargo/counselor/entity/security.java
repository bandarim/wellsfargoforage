package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class security {

    @Id
    @GeneratedValue()
    private long securityID;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private long quantity;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private double total;

    @Column(nullable = false)
    private long purchaseDate;

    protected security() {
        

    }

    public security(String type, long quantity, double price, double total, long purchaseDate) {
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.purchaseDate = purchaseDate;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public Long getQuantity() {
        return quantity;
    }
    public void setQuantity(long quantity){
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public long getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(long purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
