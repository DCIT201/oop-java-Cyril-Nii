package com.vms_sample;

public class Motorcycle extends Vehicle implements Rentable {

    private boolean hasSidecar;
    private boolean isOffroad;
    private final double baseRentalRate = 80.00;
    private double engineCapacity;

    // Constructor
    public Motorcycle(String vehicleId, String manufacturer, String model, RentalAgency rentalAgency, boolean isAvailable, String color, int horsepower, TransmissionType transmissionType, boolean hasSidecar, boolean isOffroad, double engineCapacity) {
        super(vehicleId, manufacturer, model, rentalAgency, isAvailable, color, horsepower, transmissionType);

        this.hasSidecar = hasSidecar;
        this.isOffroad = isOffroad;
        this.engineCapacity = engineCapacity;
    }

    // Getters and Setters
    public boolean getHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public boolean getIsOffroad() {
        return isOffroad;
    }

    public void setIsOffroad(boolean isOffroad) {
        this.isOffroad = isOffroad;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        if (days <= 0) {
            return 0.0;
        } else {
            double rentalRate = baseRentalRate;

            // Add additional charges based on the motorcycle's features
            if (hasSidecar) {
                rentalRate += 20.00;
            }

            if (isOffroad) {
                rentalRate += 30.00;
            }

            return rentalRate * days;
        }
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public boolean rent(Customer customer, int days) {
        if (isAvailable()) {
            setAvailable(false);
            customer.addRental(this);
            getRentalAgency().setMotorcyclesRented(getRentalAgency().getMotorcyclesRented() + 1);
            return true;
        }
        return false;
    }

    @Override
    public boolean returnVehicle() {
        this.setIsAvailable(true);
        return true;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "vehicleId='" + getVehicleId() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", isAvailable=" + isAvailable() +
                ", color='" + getColor() + '\'' +
                ", horsepower=" + getHorsepower() +
                ", transmissionType=" + getTransmissionType() +
                ", engineCapacity=" + engineCapacity +
                ", hasSidecar=" + hasSidecar +
                ", isOffroad=" + isOffroad +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Motorcycle motorcycle = (Motorcycle) obj;

        return getVehicleId().equals(motorcycle.getVehicleId());
    }

    @Override
    public int hashCode() {
        return getVehicleId().hashCode();
    }
}