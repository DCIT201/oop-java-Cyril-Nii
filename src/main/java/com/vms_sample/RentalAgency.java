package com.vms_sample;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {

    private String AgencyName;
    private String AgencyAddress;
    private String AgencyPhoneNumber;

    private List<Vehicle> fleet;
    private List<RentalTransaction> transactions;

    

    public RentalAgency(String AgencyName, String AgencyAddress, String AgencyPhoneNumber) {
        this.AgencyName = AgencyName;
        this.AgencyAddress = AgencyAddress;
        this.AgencyPhoneNumber = AgencyPhoneNumber;
        this.fleet = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }




    public String getAgencyName() {
        return AgencyName;
    }  

    public void setAgencyName(String AgencyName) {
        this.AgencyName = AgencyName;
    }

    public String getAgencyAddress() {
        return AgencyAddress;
    }

    public void setAgencyAddress(String AgencyAddress) {
        this.AgencyAddress = AgencyAddress;
    }

    public String getAgencyPhoneNumber() {
        return AgencyPhoneNumber;
    }

    public void setAgencyPhoneNumber(String AgencyPhoneNumber) {
        this.AgencyPhoneNumber = AgencyPhoneNumber;
    }


    public void addVehicleToFleet(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void removeVehicleFromFleet(Vehicle vehicle) {
        fleet.remove(vehicle);
    }

    public List<Vehicle> getFleet() {
        return fleet;
    }

    public void processRental(Customer customer, Vehicle vehicle, int days) {
        if (vehicle.isAvailableForRental() && customer.isEligible()) {
            customer.addRental(vehicle);
            transactions.add(new RentalTransaction(customer, vehicle, days));
        }
    }


    public String generateReport() {
        return "Rental Agency Report" +
                "\nTotal Fleet Size: " + fleet.size() +
                "\nTotal Transactions: " + transactions.size();
    }


    public List<RentalTransaction> getTransactions() {
        return transactions;
    }
}