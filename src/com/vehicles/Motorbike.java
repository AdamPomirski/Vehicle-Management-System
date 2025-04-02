package com.vehicles;

public class Motorbike extends Vehicle {

    public enum Make_Motorbike {
        APRILIA,
        BENELLI,
        BMW,
        DUCATI,
        HARLEY_DAVIDSON,
        HONDA,
        KAWASAKI,
        KTM,
        MV_AGUSTA,
        SUZUKI,
        TRIUMPH,
        YAMAHA
    }

    private final Make_Motorbike makeMotorbike;

    private boolean hasLuggageBox;

    public Motorbike(Make_Motorbike makeMotorbike, String model, int yearOfManufacture, Gearbox gearbox, String vehicleIdentificationNumber, int mileage, Colour colour, boolean hasLuggageBox) {
        super(model, yearOfManufacture, gearbox, vehicleIdentificationNumber, mileage, colour);
        this.makeMotorbike = makeMotorbike;
        this.hasLuggageBox = hasLuggageBox;
    }


    public boolean hasLuggageBox() { return hasLuggageBox; }
    public void setHasLuggageBox(boolean hasLuggageBox) { this.hasLuggageBox = hasLuggageBox; }

    @Override
    public String toString() {
        return "Motorbike - " + ", Make - " + makeMotorbike +  super.toString() + ", Has a luggage box - " + hasLuggageBox;
    }
}


