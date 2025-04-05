package com.vehicles;

import java.util.ArrayList;
import java.util.List;

import devtools.ui.Application;
import devtools.ui.Menu;
import devtools.util.Reader;

public class Main {

    public static List<Vehicle> Vehicles = new ArrayList<>();

    @Menu(command = "C", description = "Create a new vehicle record", id = 1)
    public static void createNewVehicleRecord() {
        int numVehicles = Reader.readInt("How many vehicles would you like to add? ");

        for (int i = 0; i < numVehicles; i++) {
            System.out.println("\nAdding vehicle " + (i + 1) + " of " + numVehicles);
            Vehicle newVehicle = null;

            // Loop until a valid vehicle is created
            while (newVehicle == null) {
                String vehicleSubClass = Reader.readLine("Are you trying to add a Car or a Motorbike?");

                if (vehicleSubClass.equalsIgnoreCase("Car")) {
                    Car.Make_Car make = Reader.readEnum("Enter make: ", Car.Make_Car.class);
                    String model = Reader.readLine("Enter model: ");
                    int year = Reader.readInt("Enter year of manufacture: ");
                    Vehicle.Gearbox gearbox = Reader.readEnum("Enter gearbox type (Manual/Auto): ", Vehicle.Gearbox.class);

                    String vehicleIdentificationNumber;
                    while (true) {
                        vehicleIdentificationNumber = Reader.readLine("Enter Vehicle Identification Number (VIN): ");
                        boolean vinExists = false;

                        for (Vehicle vehicle : Vehicles) {
                            if (vehicle.getVehicleIdentificationNumber().equalsIgnoreCase(vehicleIdentificationNumber)) {
                                System.out.println("VIN already exists! Please enter a unique VIN.");
                                vinExists = true;
                                break;
                            }
                        }

                        if (!vinExists) break;
                    }

                    int mileage = Reader.readInt("Enter mileage: ");
                    Vehicle.Colour colour = Reader.readEnum("Enter colour: ", Vehicle.Colour.class);

                    String carSubClass = Reader.readLine("Is it a Hatchback, Saloon, SUV, or Estate?");
                    boolean hasSatNav = Reader.readLine("Does it have Sat Nav? (yes/no)").equalsIgnoreCase("yes");
                    boolean hasParkingSensors = Reader.readLine("Does it have Parking Sensors? (yes/no)").equalsIgnoreCase("yes");
                    boolean hasTowBar = Reader.readLine("Does it have a Tow Bar? (yes/no)").equalsIgnoreCase("yes");
                    boolean hasRoofRack = Reader.readLine("Does it have a Roof Rack? (yes/no)").equalsIgnoreCase("yes");

                    switch (carSubClass.toLowerCase()) {
                        case "suv":
                            boolean hasAWD = Reader.readLine("Does it have All-Wheel Drive? (yes/no)").equalsIgnoreCase("yes");
                            newVehicle = new SUV(make, model, year, gearbox, vehicleIdentificationNumber, mileage, colour, hasSatNav, hasParkingSensors, hasTowBar, hasRoofRack, hasAWD);
                            break;
                        case "hatchback":
                            newVehicle = new Hatchback(make, model, year, gearbox, vehicleIdentificationNumber, mileage, colour, hasSatNav, hasParkingSensors, hasTowBar, hasRoofRack);
                            break;
                        case "saloon":
                            newVehicle = new Saloon(make, model, year, gearbox, vehicleIdentificationNumber, mileage, colour, hasSatNav, hasParkingSensors, hasTowBar, hasRoofRack);
                            break;
                        case "estate":
                            boolean hasThirdRow = Reader.readLine("Does it have a Third-Row Seat? (yes/no)").equalsIgnoreCase("yes");
                            newVehicle = new Estate(make, model, year, gearbox, vehicleIdentificationNumber, mileage, colour, hasSatNav, hasParkingSensors, hasTowBar, hasRoofRack, hasThirdRow);
                            break;
                        default:
                            System.out.println("Invalid car type! Please try again.");
                            // Return to the top of while loop
                            continue;
                    }

                    System.out.println("Car added successfully!");

                } else if (vehicleSubClass.equalsIgnoreCase("Motorbike")) {
                    Motorbike.Make_Motorbike make = Reader.readEnum("Enter make: ", Motorbike.Make_Motorbike.class);
                    String model = Reader.readLine("Enter model: ");
                    int year = Reader.readInt("Enter year of manufacture: ");
                    Vehicle.Gearbox gearbox = Reader.readEnum("Enter gearbox type (Manual/Auto): ", Vehicle.Gearbox.class);

                    String vehicleIdentificationNumber;
                    while (true) {
                        vehicleIdentificationNumber = Reader.readLine("Enter Vehicle Identification Number (VIN): ");
                        boolean vinExists = false;

                        for (Vehicle vehicle : Vehicles) {
                            if (vehicle.getVehicleIdentificationNumber().equalsIgnoreCase(vehicleIdentificationNumber)) {
                                System.out.println("VIN already exists! Please enter a unique VIN.");
                                vinExists = true;
                                break;
                            }
                        }

                        if (!vinExists) break;
                    }

                    int mileage = Reader.readInt("Enter mileage: ");
                    Vehicle.Colour colour = Reader.readEnum("Enter colour: ", Vehicle.Colour.class);
                    boolean hasLuggageBox = Reader.readLine("Does it have a Luggage Box? (yes/no)").equalsIgnoreCase("yes");

                    newVehicle = new Motorbike(make, model, year, gearbox, vehicleIdentificationNumber, mileage, colour, hasLuggageBox);
                    System.out.println("Motorbike added successfully!");
                } else {
                    System.out.println("Invalid vehicle type! Please enter 'Car' or 'Motorbike'.");
                }
            }
            // Add the new vehicle once it has been created
            Vehicles.add(newVehicle);
        }
    }

    @Menu(command = "S", description = "Search for vehicle by VIN", id = 2)
    public static void searchVehicleByVIN() {
        String vinToSearch = Reader.readLine("Please enter the VIN of the vehicle you wish to search for: ");

        for (Vehicle vehicle : Vehicles) {
            if (vehicle.getVehicleIdentificationNumber().equalsIgnoreCase(vinToSearch)) {
                System.out.println("Vehicle identified: " + vehicle);
                return;
            }
        }

        System.out.println("Sorry, there is no vehicle with the VIN: " + vinToSearch);
    }

    @Menu(command = "E", description = "Edit details of a vehicle", id = 3)
    public static void editVehicleDetails() {
        String vinToEdit = Reader.readLine("Enter the VIN of the vehicle you want to edit: ");

        // Find the vehicle by VIN
        Vehicle foundVehicle = null;
        for (Vehicle v : Vehicles) {
            if (v.getVehicleIdentificationNumber().equalsIgnoreCase(vinToEdit)) {
                foundVehicle = v;
                break;
            }
        }

        if (foundVehicle == null) {
            System.out.println("No vehicle found with VIN: " + vinToEdit);
            return;
        }

        System.out.println("🔍 Vehicle found: " + foundVehicle);

        // Edit vehicle details
        boolean successfulVehicleEditMade = false;
        while (!successfulVehicleEditMade) {
            System.out.println("What would you like to update?");
            if (foundVehicle instanceof Hatchback || foundVehicle instanceof Saloon) {
                VehicleEditor.printHatchbackAndSaloonOptions();
                successfulVehicleEditMade = VehicleEditor.switchHatchbackAndSaloonOptions(foundVehicle);
            } else if (foundVehicle instanceof SUV) {
                VehicleEditor.printSUVOptions();
                successfulVehicleEditMade = VehicleEditor.switchSUVOptions(foundVehicle);
            } else if (foundVehicle instanceof Estate) {
                VehicleEditor.printEstateOptions();
                successfulVehicleEditMade = VehicleEditor.switchEstateOptions(foundVehicle);
            } else if (foundVehicle instanceof Motorbike) {
                VehicleEditor.printMotorbikeOptions();
                successfulVehicleEditMade = VehicleEditor.switchMotorbikeOptions(foundVehicle);
            }

        }
    }

    @Menu(command = "D", description = "Display all available vehicles", id = 4)
    public static void displayAllAvailableVehicles() {
        for (Vehicle vehicle : Vehicles) {
            System.out.println(vehicle);
        }
    }

    @Menu(command = "Z", description = "Remove a vehicle record", id = 5)
    public static void removeVehicleRecord() {
        String vinToRemove = Reader.readLine("Please enter the VIN of the vehicle you wish to remove: ");

        Vehicle foundVehicle = null;
        for (Vehicle v : Vehicles) {
            if (v.getVehicleIdentificationNumber().equalsIgnoreCase(vinToRemove)) {
                foundVehicle = v;
                break;
            }
        }

        if (foundVehicle != null) {
            Vehicles.remove(foundVehicle);
            System.out.println("Vehicle removed successfully.");
        } else {
            System.out.println("No vehicle found with VIN: " + vinToRemove);
        }
    }

    @Menu(command = "T", description = "Search for vehicles by type", id = 6)
    public static void sortVehiclesByType() {

        System.out.println("What vehicle type would you like to search for?");
        System.out.println("1. Motorbike");
        System.out.println("2. SUV");
        System.out.println("3. Hatchback");
        System.out.println("4. Estate)");
        System.out.println("5. Saloon");

        int choice = Reader.readInt("Please enter the vehicle type you would like to search for: ");
        VehicleEditor.switchSearchVehiclesByType(choice, Vehicles);

    }

    public static void main(String[] args) {
        Vehicles = SampleData.loadSampleVehicles();
        Application.start(Main.class);
    }

}

