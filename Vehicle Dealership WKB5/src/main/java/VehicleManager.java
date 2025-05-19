
import java.util.ArrayList;
import java.util.Iterator;

public class VehicleManager {
    private static final ArrayList<Vehicles> inventory = new ArrayList<>();


    public static ArrayList<Vehicles> getVehicles() throws Exception {
        if (inventory.isEmpty()) {
            // Supercars
            inventory.add(new Vehicles("Car", "93 Octane", "Ferrari", "SF90 Stradale", "Coupe", "Rosso Corsa", "ZFF90FLA0J02500093", 2025, 0, 507000.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "Lamborghini", "Revuelto", "Coupe", "Verde Scandalo", "ZHWUC93ZAXFLA000093", 2025, 0, 987900.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "McLaren", "750S", "Coupe", "Lantana Purple", "SBM934BCA0SW0093934", 2025, 20, 449790.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "Aston Martin", "DB932", "Coupe", "Ultramarine Black", "SCFRMFGW7SGM934980", 2025, 23, 249000.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "Pagani", "Utopia", "Coupe", "Rosso Fuoco", "W93KUN6AAXFHA000093", 2024, 0, 2500000.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "Ferrari", "296 GTB", "Coupe", "Giallo Modena", "ZFF95VFA0M02500093", 2025, 0, 320000.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "Lamborghini", "Temerario", "Coupe", "Arancio Argos", "ZHWUC93ZAXFGA000093", 2025, 0, 500000.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "Maserati", "MC20", "Coupe", "Bianco Audace", "ZAM93NAAAXJY0000093", 2025, 0, 2935000.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "Porsche", "99393 GT3 RS", "Coupe", "Shark Blue", "WP0ZZZ99ZLS0000093", 2024, 0, 375000.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "Ferrari", "F8 Spider", "Nero", "Nero Daytona", "ZFF80KFA0J02500093", 2022, 2895, 439900.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "Ferrari", "F8 Spider", "Giallo Modena", "Giallo Modena", "ZFF80KFA0J0250002", 2022, 46934, 434900.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "Lamborghini", "Aventador", "LP750-4 SuperVeloce", "Rosso Mars", "ZHWUC93ZD0GLA000093", 2023, 93042, 539900.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "Lamborghini", "Aventador S", "Rosso Efesto", "Rosso Efesto", "ZHWUC93ZD0HLA007665", 2023, 7260, 4935900.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "McLaren", "720S", "Performance", "Silica White", "SBM934DCA0JW0000093", 2020, 3500, 299000.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "McLaren", "765LT", "Coupe", "Napier Green", "SBM934DCA0KW0000093", 2022, 93500, 595000.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "Porsche", "99393 Turbo S", "Coupe", "Crayon", "WP0ZZZ99ZLS000002", 2022, 93200, 205000.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "Aston Martin", "DBS Superleggera", "Coupe", "Magnetic Silver", "SCFRMFAJ0JGA000093", 2023, 4000, 250000.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "Bugatti", "Chiron", "Sport", "Nocturne", "VF9SA2V3XJH0000093", 2023, 500, 3000000.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "Koenigsegg", "Jesko", "Absolut", "Pearl White", "YV93KJ0AAXKA000093", 2023, 9300, 2800000.00, true));
            inventory.add(new Vehicles("Car", "93 Octane", "Bentley", "Continental GTC Speed", "Convertible", "Sequin Blue", "SCBBS3ZA3FC0000093", 2025, 66, 389900.00, true));

            // Trucks
            inventory.add(new Vehicles("Truck", "91 Octane", "Ford", "F-150 Raptor R", "SuperCrew", "Code Orange", "1FTFW1RJ9RFA00094", 2025, 150, 112725.00, true));
            inventory.add(new Vehicles("Truck", "93 Octane", "Ram", "1500 TRX", "Crew Cab", "Ignition Orange", "1C6SRFU91PN000095", 2025, 120, 96000.00, true));
            inventory.add(new Vehicles("Truck", "93 Octane", "Chevrolet", "Silverado 1500 ZR2", "Crew Cab", "Black", "3GCUDFEL5RG000096", 2025, 80, 72000.00, true));
            inventory.add(new Vehicles("Truck", "93 Octane", "GMC", "Sierra 1500 Denali", "Crew Cab", "White Frost Tricoat", "1GTU9FEL5RZ000098", 2025, 50, 85000.00, true));

            // SUVs
            inventory.add(new Vehicles("SUV", "93 Octane", "Aston Martin", "DBX707", "Luxury", "Lunar White", "SCFBB03B1PG000099", 2025, 25, 249000.00, true));
            inventory.add(new Vehicles("SUV", "93 Octane", "Audi", "RS Q8 Performance", "Sport", "Nardo Gray", "WA1AVBF1XRD000100", 2025, 30, 127000.00, true));
            inventory.add(new Vehicles("SUV", "93 Octane", "Porsche", "Cayenne Turbo E-Hybrid", "Coupe", "Crayon", "WP1AE2AY0RDA00101", 2025, 20, 157000.00, true));
            inventory.add(new Vehicles("SUV", "93 Octane", "BMW", "X6 M Competition", "M Sport", "Marina Bay Blue", "5UXCY6C07R9A00102", 2025, 35, 129700.00, true));
            inventory.add(new Vehicles("SUV", "93 Octane", "Dodge", "Durango SRT Hellcat", "SRT", "Destroyer Gray", "1C4SDJH91RC000103", 2025, 40, 100000.00, true));
        }



        return inventory;
    }







    public void removeVehicleByVin(String vin) throws Exception {
        Iterator<Vehicles> iterator = getVehicles().iterator();
        boolean removed = false;

        while (iterator.hasNext()) {
            Vehicles v = iterator.next();
            if (v.getVin().equals(vin)) {
                iterator.remove();
                removed = true;
                System.out.println("Removed vehicle with vin: " + vin);
            }

            if (!removed) {
                System.out.println("No vehicle found with that vin: " + vin);
            }


        }


    }

    public void addVehicle(Vehicles vehicle) throws Exception {
        if (vehicle == null) {
            System.out.println("Cannot be null.");
        } else {
            VehicleManager.getVehicles().add(vehicle);


        }
    }
}













