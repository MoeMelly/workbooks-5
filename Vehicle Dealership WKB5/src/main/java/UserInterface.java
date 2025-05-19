import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserInterface {
    static Scanner scan = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    public static void timer(int timer) {

        try {
            Thread.sleep(timer);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getMake(ArrayList<Vehicles> allVehicles) throws Exception {
        System.out.println("Enter Vehicle Make: ");
        String make = scan.nextLine().trim();

        ArrayList<Vehicles> filteredList = new ArrayList<>(VehicleManager.getVehicles().stream()
                .filter(vehicles -> vehicles.getMake().trim().equalsIgnoreCase(make))
                .toList());

        if (filteredList.isEmpty()) {
            System.out.println("No Vehicle found");
        } else {
            for (Vehicles vehicles : filteredList) {
                System.out.println(vehicles + vehicles.getMake() + " " + vehicles.getModel());
            }
        }

    }

    public static void getVehicleModel(ArrayList<Vehicles> allVehicles) throws Exception {
        System.out.print("Enter Vehicle Model: ");
        String model = scan.nextLine();

        ArrayList<Vehicles> filiteredList = new ArrayList<>(VehicleManager.getVehicles().stream()
                .filter(vehicles -> vehicles.getModel().trim().equalsIgnoreCase(model))
                .toList());

        if (filiteredList.isEmpty()) {
            System.out.println("No Vehicles found.");
        } else {
            for (Vehicles vehicles : filiteredList) {
                System.out.println(vehicles + vehicles.getModel());
            }
        }

    }

    public static void getVehicleTrim(ArrayList<Vehicles> allVehicles) throws Exception {
        System.out.println("Enter Vehicle Trim: ");
        String trim = scan.nextLine().trim();


        List<Vehicles> allVehicle = VehicleManager.getVehicles();

        List<Vehicles> filteredVehicles = allVehicles.stream()
                .filter(vehicle -> {
                    String vehicleTrim = vehicle.getTrim();
                    if (vehicleTrim != null) {
                        boolean matches = vehicleTrim.equalsIgnoreCase(trim);
                        System.out.println("Comparing input: '" + trim + "' with vehicle trim: '" + vehicleTrim.trim() + "' => Match: " + matches);
                        return matches;
                    }
                    return false;
                })
                .toList();


        if (filteredVehicles.isEmpty()) {
            System.out.println("No Vehicle found.");
        } else {
            for (Vehicles vehicle : filteredVehicles) {
                System.out.println(vehicle.getMake() + " " + vehicle.getModel() + " " + vehicle.getTrim());

            }
        }
    }

    public static void getVehicleColor(ArrayList<Vehicles> allVehicles) throws Exception {
        System.out.println("Enter Vehicle Color: ");
        String color = scan.nextLine();

        List<Vehicles> allVehicle = VehicleManager.getVehicles();

        List<Vehicles> filteredVehicle = allVehicles.stream()
                .filter(vehicle -> {
                    String vehicleColor = vehicle.getColor();
                    if (vehicleColor != null) {
                        boolean matches = vehicleColor.equalsIgnoreCase(color);
                        System.out.println("Comparing input: '" + color + "' with vehicle trim: '" + vehicleColor.trim() + "' => Match: " + matches);
                        return matches;
                    }
                    return false;
                })
                .toList();


        if (filteredVehicle.isEmpty()) {
            System.out.println("No Vehicle found.");
        } else {
            for (Vehicles vehicle : filteredVehicle) {
                System.out.println(vehicle.getMake() + " " + vehicle.getModel() + " " + vehicle.getTrim() + " " + vehicle.getColor());

            }
        }
    }

    public static void getVehicleVin(ArrayList<Vehicles> allVehicles) throws Exception {
        System.out.println("Enter Vehicle Vin: ");
        String vin = scan.nextLine();

        List<Vehicles> allVehicle = VehicleManager.getVehicles();

        List<Vehicles> filteredVehicle = allVehicles.stream()
                .filter(vehicle -> {
                    String vehicleVin = vehicle.getVin();
                    if (vehicleVin != null) {
                        boolean matches = vehicleVin.equalsIgnoreCase(vin);
                        System.out.println("Comparing input: '" + vin + "' with vehicle trim: '" + vin.trim() + "' => Match: " + matches);
                        return matches;
                    }
                    return false;
                })
                .toList();


        if (filteredVehicle.isEmpty()) {
            System.out.println("No Vehicle found.");
        } else {
            for (Vehicles vehicle : filteredVehicle) {
                System.out.println(vehicle.getMake() + " " + vehicle.getModel() + " " + vehicle.getTrim() + " " + vehicle.getVin());


            }
        }
    }


        public static void getVehicleYear(ArrayList<Vehicles> allVehicles) {
            System.out.println("Enter Vehicle Year: ");
            int year = scan.nextInt();
            scan.nextLine();

            List<Vehicles> filteredVehicles = allVehicles.stream()
                    .filter(vehicle -> vehicle.getYear() == year)
                    .toList();

            if (filteredVehicles.isEmpty()) {
                System.out.println("No vehicles found for the year " + year);
            } else {
                filteredVehicles.forEach(vehicle ->
                        System.out.println(vehicle.getMake() + " " + vehicle.getModel() + " " + vehicle.getYear())
                );
            }
        }

    public static void getVehicleMileage(ArrayList<Vehicles> allVehicles) {
        System.out.println("Enter maximum mileage: ");
        int maxMileage = scan.nextInt();
        scan.nextLine();

        List<Vehicles> filteredVehicles = allVehicles.stream()
                .filter(vehicle -> vehicle.getOdometer() <= maxMileage)
                .toList();

        if (filteredVehicles.isEmpty()) {
            System.out.println("No vehicles found with mileage under " + maxMileage);
        } else {
            filteredVehicles.forEach(vehicle ->
                    System.out.println(vehicle.getMake() + " " + vehicle.getModel() + " Mileage: " + vehicle.getOdometer())
            );
        }
    }

    public static void getVehiclePrice(ArrayList<Vehicles> allVehicles) {
        System.out.print("Enter minimum price: ");
        double minPrice = scan.nextDouble();
        System.out.print("Enter maximum price: ");
        double maxPrice = scan.nextDouble();
        scan.nextLine();

        List<Vehicles> filteredVehicles = allVehicles.stream()
                .filter(vehicle -> vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxPrice)
                .toList();

        if (filteredVehicles.isEmpty()) {
            System.out.println("No vehicles found between $" + minPrice + " and $" + maxPrice);
        } else {
            filteredVehicles.forEach(vehicle ->
                    System.out.println(vehicle.getMake() + " " + vehicle.getModel() + " Price: $" + vehicle.getPrice()));
        }
    }

    public static void homeMenu() throws Exception {
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("1.-View Vehicle Inventory-");
            timer(100);
            System.out.println("\n==========================");
            System.out.println("2.-Get Vehicles By type-");
            timer(50);
            System.out.println("\n==========================");
            System.out.println("3.-Get Vehicles by fuel type -");
            timer(50);
            System.out.println("\n==========================");
            System.out.println("4.-Get Vehicles by Model-");
            timer(50);
            System.out.println("\n===========================");
            System.out.println("5.-Get Vehicles by trim-");
            timer(50);
            System.out.println("\n===========================");
            System.out.println("6.-Get Vehicles by color-");
            timer(50);
            System.out.println("\n=======================");
            timer(50);
            System.out.println("7.-Search by Vin Number-");
            timer(50);
            System.out.println("\n========================");
            timer(50);
            System.out.println("8.-Get Vehicles by year-");
            timer(50);
            System.out.println("\n=========================");
            System.out.println("9.-Get Vehicles by mileage-");
            timer(50);
            System.out.println("\n============================");
            timer(50);
            System.out.println("10.-Get Vehicles by price-");
            String input = scan.nextLine();

            switch (input) {
                case "1":
                    System.out.println("Loading vehicle inventory...");
                    timer(70);
                    loadVehicles();
                    break;
                case "2":
                    System.out.println("Please wait...");
                    timer(400);
                    getType(DealershipManager.vehicles());
                    break;
                case "3":
                    timer(200);
                    getFuelType(DealershipManager.vehicles());
                    break;
                case "4":
                    timer(300);
                    getVehicleModel(DealershipManager.vehicles());
                    break;
                case "5":
                    timer(300);
                    getVehicleTrim(DealershipManager.vehicles());
                    break;
                case "6":
                    timer(300);
                    getVehicleColor(DealershipManager.vehicles());
                    break;
                case "7":
                    timer(300);
                    getVehicleVin(DealershipManager.vehicles());
                    break;
                case "8":
                    timer(300);
                    getVehicleYear(DealershipManager.vehicles());
                    break;
                case "9":
                    timer(300);
                    getVehicleMileage(DealershipManager.vehicles());
                    break;
                case "10":
                    timer(300);
                    getVehiclePrice(DealershipManager.vehicles());
                    break;
                case "11":
                    timer(200);
                    getMake(DealershipManager.vehicles());
                case "0":
                    System.out.println("Exiting the program...");
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

    }

    public static void loadVehicles() throws Exception {
        ArrayList<Vehicles> inventory = VehicleManager.getVehicles();
        for (Vehicles vehicle : inventory) {
            timer(50);
            System.out.println(vehicle);
        }
    }

    public static void getType(ArrayList<Vehicles> allVehicles) throws Exception {
        System.out.println("Enter Vehicle type");
        String type = scan.nextLine();

        ArrayList<Vehicles> filteredVehicles = new ArrayList<>(VehicleManager.getVehicles().stream()
                .filter(vehicles -> vehicles.getType().trim().equalsIgnoreCase(type.trim()))
                .toList());

        if (filteredVehicles.isEmpty()) {
            System.out.println("No Vehicle Found.");
        } else {
            for (Vehicles vehicle : filteredVehicles) {
                System.out.println(vehicle + vehicle.getType());
            }
        }


    }

    public static void getFuelType(ArrayList<Vehicles> allVehicles) throws Exception {
        System.out.print("Enter Vehicle FuelType: ");
        String input = scan.nextLine().trim();

        List<Vehicles> allVehicle = VehicleManager.getVehicles();

        List<Vehicles> filteredVehicles = allVehicles.stream()
                .filter(vehicle -> {
                    String vehicleFuelType = vehicle.getFuelType();
                    if (vehicleFuelType != null) {
                        boolean matches = vehicleFuelType.trim().equalsIgnoreCase(input);
                        System.out.println("Comparing input: '" + input + "' with vehicle fuel type: '" + vehicleFuelType.trim() + "' => Match: " + matches);
                        return matches;
                    }
                    return false;
                })
                .toList();

        if (filteredVehicles.isEmpty()) {
            System.out.println("No Vehicle found.");
        } else {
            for (Vehicles vehicle : filteredVehicles) {
                System.out.println(vehicle.getFuelType() + " " + vehicle.getMake() + " " + vehicle.getModel());
            }
        }
    }
}













