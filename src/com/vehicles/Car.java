package com.vehicles;

public abstract class Car extends Vehicle {

    public enum Make_Car {
        AUDI,
        BMW,
        CHRYSLER,
        CITROEN,
        CHEVROLET,
        FERRARI,
        FORD,
        HYUNDAI,
        JEEP,
        KIA,
        LAND_ROVER,
        LAMBORGHINI,
        MAZDA,
        MERCEDES,
        MITSUBISHI,
        NISSAN,
        PEUGEOT,
        PORSCHE,
        ROLLS_ROYCE,
        SKODA,
        SUBARU,
        TESLA,
        TOYOTA,
        VOLKSWAGEN,
        VOLVO
    }

    private final Make_Car makeCar;
    private boolean hasSatNav;
    private boolean hasParkingSensors;
    private boolean hasTowBar;
    private boolean hasRoofRack;

    public Car(Make_Car makeCar, String model, int yearOfManufacture, Gearbox gearbox, String vehicleIdentificationNumber, int mileage, Colour colour, boolean hasSatNav, boolean hasParkingSensors, boolean hasTowBar, boolean hasRoofRack) {
        super(model, yearOfManufacture, gearbox, vehicleIdentificationNumber, mileage, colour);
        this.makeCar = makeCar;
        this.hasSatNav = hasSatNav;
        this.hasParkingSensors = hasParkingSensors;
        this.hasTowBar = hasTowBar;
        this.hasRoofRack = hasRoofRack;
    }

    public boolean hasSatNav() { return hasSatNav; }
    public boolean hasParkingSensors() { return hasParkingSensors; }
    public boolean hasTowBar() { return hasTowBar; }
    public boolean hasRoofRack() { return hasRoofRack; }

    public Car.Make_Car getMake_Car() { return makeCar; }

    public void setHasSatNav(boolean hasSatNav) { this.hasSatNav = hasSatNav; }
    public void setHasParkingSensors(boolean hasParkingSensors) { this.hasParkingSensors = hasParkingSensors; }
    public void setHasTowBar(boolean hasTowBar) { this.hasTowBar = hasTowBar; }
    public void setHasRoofRack(boolean hasRoofRack) { this.hasRoofRack = hasRoofRack; }

    @Override
    public String toString() {
        return ", Make - " + makeCar +
                super.toString() +
                ", Has Sat Nav - " + hasSatNav +
                ", Has Parking Sensors - " + hasParkingSensors +
                ", Has Tow Bar - " + hasTowBar +
                ", Has Roof Rack - " + hasRoofRack;
    }
}
