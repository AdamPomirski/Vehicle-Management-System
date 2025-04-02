package com.vehicles;

public class Estate extends Car {
    private boolean hasThirdRowSeat;

    public Estate(Make_Car make, String model, int yearOfManufacture, Gearbox gearbox, String vehicleIdentificationNumber, int mileage, Colour colour, boolean hasSatNav, boolean hasParkingSensors, boolean hasTowBar, boolean hasRoofRack, boolean hasThirdRowSeat) {
        super(make, model, yearOfManufacture, gearbox, vehicleIdentificationNumber, mileage, colour, hasSatNav, hasParkingSensors, hasTowBar, hasRoofRack);
        this.hasThirdRowSeat = hasThirdRowSeat;
    }

    public boolean hasThirdRowSeat() { return hasThirdRowSeat; }
    public void setHasThirdRowSeat(boolean hasThirdRowSeat) { this.hasThirdRowSeat = hasThirdRowSeat; }

    @Override
    public String toString() {
        return "Car - Estate - " + super.toString() + "  Has a third row seat - " + hasThirdRowSeat;
    }
}

