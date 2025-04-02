package com.vehicles;

public class SUV extends Car {
    private boolean hasAWD;

    public SUV(Make_Car make, String model, int yearOfManufacture, Gearbox gearbox, String vehicleIdentificationNumber, int mileage, Colour colour, boolean hasSatNav, boolean hasParkingSensors, boolean hasTowBar, boolean hasRoofRack, boolean hasAWD) {
        super(make, model, yearOfManufacture, gearbox, vehicleIdentificationNumber, mileage, colour, hasSatNav, hasParkingSensors, hasTowBar, hasRoofRack);
        this.hasAWD = hasAWD;
    }

    public boolean hasAWD() { return hasAWD; }
    public void setHasAWD(boolean hasAWD) { this.hasAWD = hasAWD; }

    @Override
    public String toString() {
        return "Car - SUV - " + super.toString() + "  Has AWD - " + hasAWD;
    }
}

