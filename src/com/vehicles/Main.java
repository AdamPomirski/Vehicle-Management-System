package com.vehicles;

import java.util.ArrayList;
import java.util.List;

import devtools.ui.Application;
import devtools.ui.Menu;
import devtools.util.Reader;

public class Main {

    public static List<Vehicle> Vehicles = new ArrayList<>();

    //Function to ensure correct datatype is used

    //Functions for vehicles to have correct options for editing
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

    public static void switchSearchVehiclesByType(int choice) {
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

    @Menu(command = "C", description = "Create a new vehicle record", id = 1)
    public static void createNewVehicleRecord() {
        int numVehicles = Integer.parseInt(Reader.readLine("How many vehicles would you like to add? "));

        for (int i = 0; i < numVehicles; i++) {
            System.out.println("\nAdding vehicle " + (i + 1) + " of " + numVehicles);

        String vehicleSubClass = Reader.readLine("Are you trying to add a Car or a Motorcycle?");
        if (vehicleSubClass.equalsIgnoreCase("Car")) {
            Car.Make_Car make = Reader.readEnum("Enter make: ", Car.Make_Car.class);
            String model = Reader.readLine("Enter model: ");
            int year = Integer.parseInt(Reader.readLine("Enter year of manufacture: "));
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

                if (!vinExists) {
                    break; // VIN is unique, exit loop
                }
            }
            int mileage = Integer.parseInt(Reader.readLine("Enter mileage: "));
            Vehicle.Colour colour = Reader.readEnum("Enter colour: ", Vehicle.Colour.class);

            String carSubClass = Reader.readLine("Is it a Hatchback, Saloon, SUV, or Estate?");
            boolean hasSatNav = Reader.readLine("Does it have Sat Nav? (yes/no)").equalsIgnoreCase("yes");
            boolean hasParkingSensors = Reader.readLine("Does it have Parking Sensors? (yes/no)").equalsIgnoreCase("yes");
            boolean hasTowBar = Reader.readLine("Does it have a Tow Bar? (yes/no)").equalsIgnoreCase("yes");
            boolean hasRoofRack = Reader.readLine("Does it have a Roof Rack? (yes/no)").equalsIgnoreCase("yes");
            Vehicle newCar = null;
            switch(carSubClass.toLowerCase()) {
                case "suv":
                    boolean hasAWD = Reader.readLine("Does it have All-Wheel Drive? (yes/no)").equalsIgnoreCase("yes");
                    newCar = new SUV(make, model, year, gearbox, vehicleIdentificationNumber, mileage, colour, hasSatNav, hasParkingSensors, hasTowBar, hasRoofRack, hasAWD);
                    break;
                case "hatchback":
                    newCar = new Hatchback(make, model, year, gearbox, vehicleIdentificationNumber, mileage, colour, hasSatNav, hasParkingSensors, hasTowBar, hasRoofRack);
                    break;
                case "saloon":
                    newCar = new Saloon(make, model, year, gearbox, vehicleIdentificationNumber, mileage, colour, hasSatNav, hasParkingSensors, hasTowBar, hasRoofRack);
                    break;
                case "estate":
                    boolean hasThirdRow = Reader.readLine("Does it have a Third-Row Seat? (yes/no)").equalsIgnoreCase("yes");
                    newCar = new Estate(make, model, year, gearbox, vehicleIdentificationNumber, mileage, colour, hasSatNav, hasParkingSensors, hasTowBar, hasRoofRack, hasThirdRow);
                    break;
                default:
                    System.out.println("Invalid car type!");
                    return;
            }

            Vehicles.add(newCar);
            System.out.println(carSubClass + " added successfully!");

        } else if (vehicleSubClass.equalsIgnoreCase("Motorbike")) {
            Motorbike.Make_Motorbike make = Reader.readEnum("Enter make: ", Motorbike.Make_Motorbike.class);
            String model = Reader.readLine("Enter model: ");
            int year = Integer.parseInt(Reader.readLine("Enter year of manufacture: "));
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

                if (!vinExists) {
                    break; // VIN is unique, exit loop
                }
            }
            int mileage = Integer.parseInt(Reader.readLine("Enter mileage: "));
            Vehicle.Colour colour = Reader.readEnum("Enter colour: ", Vehicle.Colour.class);
            boolean hasLuggageBox = Reader.readLine("Does it have a Luggage Box? (yes/no)").equalsIgnoreCase("yes");

            Vehicle newBike = new Motorbike(make, model, year, gearbox, vehicleIdentificationNumber, mileage, colour, hasLuggageBox);
            Vehicles.add(newBike);
            System.out.println("Motorbike added successfully!");
        } else {
            System.out.println("Invalid vehicle type!");
        } }
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
                printHatchbackAndSaloonOptions();
                successfulVehicleEditMade = switchHatchbackAndSaloonOptions(foundVehicle);
            } else if (foundVehicle instanceof SUV) {
                printSUVOptions();
                successfulVehicleEditMade = switchSUVOptions(foundVehicle);
            } else if (foundVehicle instanceof Estate) {
                printEstateOptions();
                successfulVehicleEditMade = switchEstateOptions(foundVehicle);
            } else if (foundVehicle instanceof Motorbike) {
                printMotorbikeOptions();
                successfulVehicleEditMade = switchMotorbikeOptions(foundVehicle);
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

        int choice = Integer.parseInt(Reader.readLine("Please enter the vehicle type you would like to search for: "));
        switchSearchVehiclesByType(choice);

    }

    public static void main(String[] args) {
        Vehicles = SampleData.loadSampleVehicles();
        Application.start(Main.class);
    }

}

