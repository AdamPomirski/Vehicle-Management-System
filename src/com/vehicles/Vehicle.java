package com.vehicles;

public abstract class Vehicle {

    public enum Gearbox {
        MANUAL, AUTOMATIC
    }

    public enum Colour {
        BLACK,
        WHITE,
        SILVER,
        RED,
        BLUE,
        GREEN,
        YELLOW,
        ORANGE,
        PURPLE,
        GREY,
        PINK,
        BROWN,
        BEIGE,
        GOLD,
        TURQUOISE,
        TEAL,
        INDIGO
    }

    private final String model;
    private final int yearOfManufacture;
    private final Gearbox gearbox;
    private final String vehicleIdentificationNumber;
    private int mileage;
    private Colour colour;

    public Vehicle(String model, int yearOfManufacture, Gearbox gearbox, String vehicleIdentificationNumber, int mileage, Colour colour) {

        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.gearbox = gearbox;
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        this.mileage = mileage;
        this.colour = colour;
    }

    public String getModel() { return model; }
    public int getYearOfManufacture() { return yearOfManufacture; }
    public Gearbox getGearbox() { return gearbox; }
    public String getVehicleIdentificationNumber() { return vehicleIdentificationNumber; }
    public int getMileage() { return mileage; }
    public Colour getColour() { return colour; }

    public void setMileage(int mileage) { this.mileage = mileage; }
    public void setColour(Colour colour) { this.colour = colour; }

    @Override
    public String toString() {
        return
                ", Model - " + model +
                ", Year - " + yearOfManufacture +
                ", Gearbox type - " + gearbox +
                ", Colour - " + colour +
                ", Mileage - " + mileage +
                ", VIN - " + vehicleIdentificationNumber;
    }
}
