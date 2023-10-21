package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class portfolio {

    @Id
    @GeneratedValue()
    private long portID;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private double riskFactor;

    @Column(nullable = false)
    private double total;

    protected portfolio() {
        

    }

    public portfolio(String firstName, String lastName, double riskFactor, double total) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.riskFactor = riskFactor;
        this.total = total;
    }

    public Long getPortID() {
        return portID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(Double riskFactor) {
        this.riskFactor = riskFactor;
    }

   public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}