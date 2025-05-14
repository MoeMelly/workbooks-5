import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        Asset house = new House("2390 Rodrick Trl Rd",150,3000,10000,"Luxury homes","2023-02-13",45000000);
        Asset house2 = new House("4501 Cross Ridge Trl",120,6000,8000,"Luxury Home","2022-03-14",350000);
        Asset vehicles = new Vehicle("My Personal Car", "2023-03-25", 275000, "Mclaren", "675-LT", 5000, 2);
        Asset vehicles2 = new Vehicle("My Second", "2024-07-15", 450000, "Lamborghini", "Aventador", 1000, 4);


        assets.add(house);
        assets.add(house2);
        assets.add(vehicles);
        assets.add(vehicles2);

        for (Asset a : assets) {
            a.displayInfo();
            System.out.println();


            if (a instanceof Vehicle) {
                Vehicle car = (Vehicle) a;
                System.out.println(vehicles2.getDescription());
                System.out.println(vehicles.getValue());



            }


            }

        }

    }

