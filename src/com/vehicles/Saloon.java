package com.vehicles;

public class Saloon extends Car {
    public Saloon(Make_Car make, String model, int yearOfManufacture, Gearbox gearbox, String vehicleIdentificationNumber, int mileage, Colour colour, boolean hasSatNav, boolean hasParkingSensors, boolean hasTowBar, boolean hasRoofRack) {
        super(make, model, yearOfManufacture, gearbox, vehicleIdentificationNumber, mileage, colour, hasSatNav, hasParkingSensors, hasTowBar, hasRoofRack);
    }

    @Override
    public String toString() {
        return "Car - Saloon - " + super.toString();
    }
}
