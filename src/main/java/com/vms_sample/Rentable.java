package com.vms_sample;

public interface Rentable {

    boolean isAvailableForRental();

    double calculateRentalCost(int days);

    boolean rent(Customer customer, int days);

    boolean returnVehicle();

}
