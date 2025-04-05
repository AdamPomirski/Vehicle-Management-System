package com.vehicles;

import devtools.util.Reader;

import java.util.List;

public class VehicleEditor {
    public static void printHatchbackAndSaloonOptions() {
        //Options for cars that can be changed after vehicle record has been created
        System.out.println("1. Mileage");
        System.out.println("2. Colour");
        //Options for cars that can be added but not removed
        System.out.println("3. Sat Nav (yes/no)");
        System.out.println("4. Parking Sensors (yes/no)");
        System.out.println("5. Tow Bar (yes/no)");
        System.out.println("6. Roof Rack (yes/no)");
    }

    public static void printSUVOptions() {
        printHatchbackAndSaloonOptions();
        System.out.println("7. All-Wheel Drive (yes/no)");
    }

    public static void printEstateOptions() {
        printHatchbackAndSaloonOptions();
        System.out.println("7. Third-Row Seat (yes/no)");
    }

    public static void printMotorbikeOptions() {
        System.out.println("1. Mileage");
        System.out.println("2. Colour");
        System.out.println("3. Luggage Box (yes/no)");
    }

    //Functions for correct switch statement case when editing a vehicles details
    public static boolean switchHatchbackAndSaloonOptions(Vehicle foundVehicle) {
        boolean successfulVehicleEditMade = false;
        int choice = Reader.readInt("Enter your choice: ");
        Car car = (Car) foundVehicle;

        switch (choice) {
            case 1:
                car.setMileage(Reader.readInt("Enter new mileage: "));
                successfulVehicleEditMade = true;
                break;
            case 2:
                car.setColour(Reader.readEnum("Enter new colour: ", Vehicle.Colour.class));
                successfulVehicleEditMade = true;
                break;
            case 3:
                if (!car.hasSatNav()) {
                    car.setHasSatNav(Reader.readLine("Enable Sat Nav? (yes/no)").equalsIgnoreCase("yes"));
                    successfulVehicleEditMade = true;
                } else {
                    System.out.println("Sorry, this vehicle already has sat nav and options for cars may only be added, not removed.");
                }
                break;
            case 4:
                if (!car.hasParkingSensors()) {
                    car.setHasParkingSensors(Reader.readLine("Enable Parking Sensors? (yes/no)").equalsIgnoreCase("yes"));
                    successfulVehicleEditMade = true;
                } else {
                    System.out.println("Sorry, this vehicle already has parking sensors and options for cars may only be added, not removed.");
                }
                break;
            case 5:
                if (!car.hasTowBar()) {
                    car.setHasTowBar(Reader.readLine("Enable Tow Bar? (yes/no)").equalsIgnoreCase("yes"));
                    successfulVehicleEditMade = true;
                } else {
                    System.out.println("Sorry, this vehicle already has a tow bar and options for cars may only be added, not removed.");
                }
                break;
            case 6:
                if (!car.hasRoofRack()) {
                    car.setHasRoofRack(Reader.readLine("Enable Roof Rack? (yes/no)").equalsIgnoreCase("yes"));
                    successfulVehicleEditMade = true;
                } else {
                    System.out.println("Sorry, this vehicle already has a roof rack and options for cars may only be added, not removed.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        if (successfulVehicleEditMade) {
            System.out.println("Vehicle updated successfully!");
        }

        return successfulVehicleEditMade;
    }

    public static boolean switchSUVOptions(Vehicle foundVehicle) {
        boolean successfulVehicleEditMade = false;
        int choice = Reader.readInt("Enter your choice: ");
        SUV suv = (SUV) foundVehicle;

        switch (choice) {
            case 1:
                suv.setMileage(Reader.readInt("Enter new mileage: "));
                successfulVehicleEditMade = true;
                break;
            case 2:
                suv.setColour(Reader.readEnum("Enter new colour: ", Vehicle.Colour.class));
                successfulVehicleEditMade = true;
                break;
            case 3:
                if (!suv.hasSatNav()) {
                    suv.setHasSatNav(Reader.readLine("Enable Sat Nav? (yes/no)").equalsIgnoreCase("yes"));
                    successfulVehicleEditMade = true;
                } else {
                    System.out.println("Sorry, this vehicle already has sat nav and options for cars may only be added, not removed.");
                }
                break;
            case 4:
                if (!suv.hasParkingSensors()) {
                    suv.setHasParkingSensors(Reader.readLine("Enable Parking Sensors? (yes/no)").equalsIgnoreCase("yes"));
                    successfulVehicleEditMade = true;
                } else {
                    System.out.println("Sorry, this vehicle already has parking sensors and options for cars may only be added, not removed.");
                }
                break;
            case 5:
                if (!suv.hasTowBar()) {
                    suv.setHasTowBar(Reader.readLine("Enable Tow Bar? (yes/no)").equalsIgnoreCase("yes"));
                    successfulVehicleEditMade = true;
                } else {
                    System.out.println("Sorry, this vehicle already has a tow bar and options for cars may only be added, not removed.");
                }
                break;
            case 6:
                if (!suv.hasRoofRack()) {
                    suv.setHasRoofRack(Reader.readLine("Enable Roof Rack? (yes/no)").equalsIgnoreCase("yes"));
                    successfulVehicleEditMade = true;
                } else {
                    System.out.println("Sorry, this vehicle already has a roof rack and options for cars may only be added, not removed.");
                }
                break;
            case 7:
                if (!suv.hasAWD()) {
                    suv.setHasAWD(Reader.readLine("Enable All-Wheel Drive? (yes/no)").equalsIgnoreCase("yes"));
                    successfulVehicleEditMade = true;
                } else {
                    System.out.println("Sorry, this vehicle already has AWD and options for cars may only be added, not removed.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        if (successfulVehicleEditMade) {
            System.out.println("Vehicle updated successfully!");
        }

        return successfulVehicleEditMade;
    }

    public static boolean switchEstateOptions(Vehicle foundVehicle) {
        boolean successfulVehicleEditMade = false;
        int choice = Reader.readInt("Enter your choice: ");
        Estate estate = (Estate) foundVehicle;

        switch (choice) {
            case 1:
                estate.setMileage(Reader.readInt("Enter new mileage: "));
                successfulVehicleEditMade = true;
                break;
            case 2:
                estate.setColour(Reader.readEnum("Enter new colour: ", Vehicle.Colour.class));
                successfulVehicleEditMade = true;
                break;
            case 3:
                if (!estate.hasSatNav()) {
                    estate.setHasSatNav(Reader.readLine("Enable Sat Nav? (yes/no)").equalsIgnoreCase("yes"));
                    successfulVehicleEditMade = true;
                } else {
                    System.out.println("Sorry, this vehicle already has sat nav and options for cars may only be added, not removed.");
                }
                break;
            case 4:
                if (!estate.hasParkingSensors()) {
                    estate.setHasParkingSensors(Reader.readLine("Enable Parking Sensors? (yes/no)").equalsIgnoreCase("yes"));
                    successfulVehicleEditMade = true;
                } else {
                    System.out.println("Sorry, this vehicle already has parking sensors and options for cars may only be added, not removed.");
                }
                break;
            case 5:
                if (!estate.hasTowBar()) {
                    estate.setHasTowBar(Reader.readLine("Enable Tow Bar? (yes/no)").equalsIgnoreCase("yes"));
                    successfulVehicleEditMade = true;
                } else {
                    System.out.println("Sorry, this vehicle already has a tow bar and options for cars may only be added, not removed.");
                }
                break;
            case 6:
                if (!estate.hasRoofRack()) {
                    estate.setHasRoofRack(Reader.readLine("Enable Roof Rack? (yes/no)").equalsIgnoreCase("yes"));
                    successfulVehicleEditMade = true;
                } else {
                    System.out.println("Sorry, this vehicle already has a roof rack and options for cars may only be added, not removed.");
                }
                break;
            case 7:
                if (!estate.hasThirdRowSeat()) {
                    estate.setHasThirdRowSeat(Reader.readLine("Add a third-row seat? (yes/no)").equalsIgnoreCase("yes"));
                    successfulVehicleEditMade = true;
                } else {
                    System.out.println("Sorry, this vehicle already has a third-row seat and options for cars may only be added, not removed.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        if (successfulVehicleEditMade) {
            System.out.println("Vehicle updated successfully!");
        }

        return successfulVehicleEditMade;
    }

    public static boolean switchMotorbikeOptions(Vehicle foundVehicle) {
        boolean successfulVehicleEditMade = false;
        int choice = Reader.readInt("Enter your choice: ");
        Motorbike motorbike = (Motorbike) foundVehicle;

        switch (choice) {
            case 1:
                motorbike.setMileage(Reader.readInt("Enter new mileage: "));
                successfulVehicleEditMade = true;
                break;
            case 2:
                motorbike.setColour(Reader.readEnum("Enter new colour: ", Vehicle.Colour.class));
                successfulVehicleEditMade = true;
                break;
            case 3:
                motorbike.setHasLuggageBox(
                        Reader.readLine("Enable Luggage Box? (yes/no)").equalsIgnoreCase("yes")
                );
                successfulVehicleEditMade = true;
                break;
            default:
                System.out.println("Invalid choice.");
        }

        if (successfulVehicleEditMade) {
            System.out.println("Vehicle updated successfully!");
        }

        return successfulVehicleEditMade;
    }

    public static void switchSearchVehiclesByType(int choice, List<Vehicle> Vehicles) {
        switch (choice) {
            case 1:
                for (Vehicle motorbike : Vehicles) {
                    if (motorbike instanceof Motorbike ) {
                        System.out.println(motorbike);
                    }
                }
                break;
            case 2:
                for (Vehicle suv : Vehicles) {
                    if (suv instanceof SUV ) {
                        System.out.println(suv);
                    }
                }
                break;
            case 3:
                for (Vehicle hatchback : Vehicles) {
                    if (hatchback instanceof Hatchback ) {
                        System.out.println(hatchback);
                    }
                }
                break;
            case 4:
                for (Vehicle estate : Vehicles) {
                    if (estate instanceof Estate ) {
                        System.out.println(estate);
                    }
                }
                break;
            case 5:
                for (Vehicle saloon : Vehicles) {
                    if (saloon instanceof Saloon ) {
                        System.out.println(saloon);
                    }
                }
                break;
        }
    }
}
