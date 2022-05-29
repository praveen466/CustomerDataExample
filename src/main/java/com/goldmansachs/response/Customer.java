package com.goldmansachs.response;

public class Customer {

    private String customerName;
    private long customerId;
    private long mobileNumber;
    private Address address;

    public Customer(String customerName, long customerId, long mobileNumber, Address address) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
