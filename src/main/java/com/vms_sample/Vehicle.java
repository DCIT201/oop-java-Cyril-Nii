package com.vms_sample;

public abstract class Vehicle {

    // Private encapsulated fields
    private String vehicleId;
    private String manufacturer;
    private String model;
    private RentalAgency rentalAgency;
    private boolean isAvailable;
    private int horsepower;
    private String color;
    private TransmissionType transmissionType;
    protected double baseRentalRate;

    /**
     * Enum for Transmission Type.
     * I am using transmission type as an enum because it is a fixed set of values.
     */

    public enum TransmissionType {
        AUTOMATIC,
        MANUAL
    }

    // Constructors with validation
    public Vehicle(String vehicleId, String manufacturer, String model, RentalAgency rentalAgency, boolean isAvailable, String color, int horsepower, TransmissionType transmissionType) {
        // Validate vehicle ID
        if (vehicleId == null || vehicleId.isBlank()) {
            throw new IllegalArgumentException("Vehicle ID cannot be null or blank");
        }

        // Validate Manufacturer name
        if (manufacturer == null || manufacturer.isBlank()) {
            throw new IllegalArgumentException("Manufacturer cannot be null or blank");
        }

        // Validate model
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Model cannot be null or blank");
        }

        // Validate color
        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException("Color cannot be null or blank");
        }


        // Validate horsepower
        if (horsepower <= 0) {
            throw new IllegalArgumentException("Horsepower must be greater than 0");
        }

        // Validate transmission type
        if (transmissionType == null) {
            throw new IllegalArgumentException("Transmission type cannot be null");
        }

        this.vehicleId = vehicleId;
        this.manufacturer = manufacturer;
        this.model = model;
        this.rentalAgency = rentalAgency;
        this.isAvailable = isAvailable;
        this.color = color;
        this.horsepower = horsepower;
        this.transmissionType = transmissionType;
    }

    // Getters and setters
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public RentalAgency getRentalAgency() {
        return rentalAgency;
    }

    public void setRentalAgency(RentalAgency rentalAgency) {
        this.rentalAgency = rentalAgency;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
    }

    public abstract double calculateRentalCost(int days);


    // Abstract method for checking availability of vehicle for rent
    public abstract boolean isAvailableForRental();
}