package com.vms_sample;

import java.util.ArrayList;
import java.util.List;


public class Customer {

    private String name;
    private String customerId;
    private String address;
    private String phoneNumber;
    private String licenseId;
    private boolean isEligible;
    private List<Vehicle> rentalHistory;
    private List<Vehicle> currentRentals;

    public Customer(String name, String customerId, String address, String phoneNumber, String licenseId) {
        this.name = name;
        this.customerId = customerId;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.licenseId = licenseId;
        this.isEligible = true;
    }



    // Getters and setters
    public boolean isEligible() {
        return isEligible;
    }

    public void setEligible(boolean eligible) {
        isEligible = eligible;
    }

    public List<Vehicle> getRentalHistory() {
        return rentalHistory;
    }

    public List<Vehicle> getCurrentRentals() {
        return currentRentals;
    }

    public void addRental(Vehicle vehicle) {
        currentRentals.add(vehicle);
    }

    public void returnRental(Vehicle vehicle) {
        currentRentals.remove(vehicle);
        rentalHistory.add(vehicle);
    }

    }
