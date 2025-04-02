package com.vehicles;

import java.util.ArrayList;
import java.util.List;

public class SampleData {
    public static List<Vehicle> loadSampleVehicles() {
        List<Vehicle> Vehicles = new ArrayList<>();

        // Adding SUVs
        Vehicles.add(new SUV(Car.Make_Car.TOYOTA, "RAV4", 2023, Vehicle.Gearbox.AUTOMATIC, "1C3CCCAB9FN602482", 12000, Vehicle.Colour.BROWN, true, true, false, true, true));
        Vehicles.add(new SUV(Car.Make_Car.HONDA, "CR-V", 2024, Vehicle.Gearbox.AUTOMATIC, "JN8AS5MT9CW265361", 8000, Vehicle.Colour.GREEN, true, true, false, false, true));

        // Adding Hatchbacks
        Vehicles.add(new Hatchback(Car.Make_Car.FIAT, "Tipo", 2016, Vehicle.Gearbox.MANUAL, "1C3EL55R14N187005", 15000, Vehicle.Colour.ORANGE, false, true, false, false));
        Vehicles.add(new Hatchback(Car.Make_Car.FORD, "Fiesta", 2021, Vehicle.Gearbox.AUTOMATIC, "1B4HR28Y5YF288697", 18000, Vehicle.Colour.INDIGO, true, true, true, false));

        // Adding Saloons
        Vehicles.add(new Saloon(Car.Make_Car.VOLVO, "S 90", 2023, Vehicle.Gearbox.AUTOMATIC, "1GYFK66857R234056", 9000, Vehicle.Colour.PINK, true, true, false, false));
        Vehicles.add(new Saloon(Car.Make_Car.MERCEDES, "C-Class", 2024, Vehicle.Gearbox.MANUAL, "JTEGH20V730092688", 7000, Vehicle.Colour.WHITE, true, true, true, false));

        // Adding Estates
        Vehicles.add(new Estate(Car.Make_Car.MERCEDES, "E-Class", 2000, Vehicle.Gearbox.AUTOMATIC, "JTJHF10UX10182895", 200000, Vehicle.Colour.BLACK, false, true, false, true, true));
        Vehicles.add(new Estate(Car.Make_Car.AUDI, "A6 Avant", 2023, Vehicle.Gearbox.AUTOMATIC, "JTKDE177550034401", 11000, Vehicle.Colour.TURQUOISE, true, true, true, true, true));

        // Adding Motorbikes
        Vehicles.add(new Motorbike(Motorbike.Make_Motorbike.KAWASAKI, "ZX-9R", 1999, Vehicle.Gearbox.MANUAL, "4T1BG22K41U840206", 5000, Vehicle.Colour.TEAL, false));
        Vehicles.add(new Motorbike(Motorbike.Make_Motorbike.HONDA, "VTX 1300", 2007, Vehicle.Gearbox.MANUAL, "JF2SJAEC5EH425156", 7000, Vehicle.Colour.SILVER, true));

        return Vehicles;
    }
}
