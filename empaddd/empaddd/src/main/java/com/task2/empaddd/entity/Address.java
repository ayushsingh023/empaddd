package com.task2.empaddd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addId;

    private String street;
    private String state;
    private String pincode;
    
    // Getters and setters
    public Long getAddId() {
        return addId;
    }
    public void setAddId(Long addId) {
        this.addId = addId;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getPincode() {
        return pincode;
    }
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    
    @Override
    public String toString() {
        return "Address [addId=" + addId + ", street=" + street + ", state=" + state + ", pincode=" + pincode + "]";
    }
}
