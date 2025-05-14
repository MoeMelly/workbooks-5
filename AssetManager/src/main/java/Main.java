import java.time.format.DateTimeFormatter;
import java.util.ArrayList;



public class Main {
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void main(String[] args) {
        ArrayList<Asset> assets = getAssets();


        for (Asset a : assets) {
            a.displayInfo();


            if (a instanceof ConcreteHouse h) {
                System.out.println("Square Footage: " + h.getSquareFoot());
                System.out.println("Lot Size: " + h.getLotSize());;
                System.out.printf("Estimated Value: $%.2f" , h.evaluatedHouseValue());
                System.out.println();
                System.out.println("\n-------------------------------------------");
            } else if (a instanceof Vehicle v) {
                System.out.println("Make: " + v.getMake());
                System.out.println("Model: " + v.getModel());
                System.out.println("Odometer: " + v.getOdometer());
                System.out.println("Original Cost: " + v.getOriginalCost());
                System.out.println("Current Value: " + v.getValue());

            }



            }


            }

    private static ArrayList<Asset> getAssets() {
        ArrayList<Asset> assets = new ArrayList<>();
        ConcreteHouse myHouse = new ConcreteHouse("2960 Sunset blvd",130,5600,43000,"Luxury Home","2025-05-12",500000);
        ConcreteHouse myHouse2 = new ConcreteHouse("5629 Houston Ridge trl",150,8000,20000,"Luxury Home","2018-07-23",450000);
        Asset vehicles = new Vehicle("My Personal Car", "2023-03-25", 275000, "Mclaren", "675-LT", 5000, 2);
        Asset vehicles2 = new Vehicle("My Second", "2024-07-15", 450000, "Lamborghini", "Aventador", 1000, 4);


        assets.add(myHouse);
        assets.add(myHouse2);
        assets.add(vehicles);
        assets.add(vehicles2);
        return assets;
    }

}



