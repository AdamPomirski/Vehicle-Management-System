package com.vehicles;

public class Hatchback extends Car {
    public Hatchback(Make_Car make, String model, int yearOfManufacture, Gearbox gearbox, String vehicleIdentificationNumber, int mileage, Colour colour, boolean hasSatNav, boolean hasParkingSensors, boolean hasTowBar, boolean hasRoofRack) {
        super(make, model, yearOfManufacture, gearbox, vehicleIdentificationNumber, mileage, colour, hasSatNav, hasParkingSensors, hasTowBar, hasRoofRack);
    }

    @Override
    public String toString() {
        return "Car - Hatchback - " + super.toString();
    }
}
