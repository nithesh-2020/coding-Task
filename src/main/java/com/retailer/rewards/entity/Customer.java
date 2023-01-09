package com.retailer.rewards.entity;

public class Customer {
    private Long customerId;
    private String customerName;
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public Long getCustomerId() {
        return customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
}
