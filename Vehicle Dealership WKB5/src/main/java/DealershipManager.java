import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;

public class DealershipManager {

    public static final String FILE_NAME = "inventory.csv";

     public static ArrayList<Vehicles> vehicles () {

         String line = null;
         Vehicles newVehicle = null;
         ArrayList<Vehicles> melchi = new ArrayList<>();
         try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

             while ((line = reader.readLine()) != null) {
                 if (line.isBlank())
                     break;
                String[] parts = line.split("\\|");
                if (parts.length == 11) {
                    String type = parts[0];
                    String fuelType = (parts[1]);
                    String make = parts[2];
                    String model = parts[3];
                    String trim = parts[4];
                    String color = parts[5];
                    String vin = parts[6];
                    int year = Integer.parseInt(parts[7]);
                    int odometer = Integer.parseInt(parts[8]);
                    double price = Double.parseDouble(parts[9]);
                    boolean carAvailable = parts[10].equals("true");

                    newVehicle = new Vehicles(type, fuelType, make, model, trim, color, vin, year, odometer, price, carAvailable);
                    melchi.add(newVehicle);

                    }

                }
             } catch (Exception e) {
             throw new RuntimeException(e);
         }


         return melchi;
     }
}



