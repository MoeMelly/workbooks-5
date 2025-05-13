import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


         Car sean = new Car(5,3,50,"Red",6,120);
         Moped kevin = new Moped(2,1,30,"Black",9000);
         SemiTruck million = new SemiTruck(18,2,300,"white,",50000);
         Hovercraft sujan = new Hovercraft(0,2,5000,"Camouflage",2,"Tanks, 2x140mm Rocket launchers,Air-Defense Systems");

        ArrayList<Vehicles> vehicles = new ArrayList<>();
        vehicles.add(sean);
        vehicles.add(kevin);
        vehicles.add(million);
        vehicles.add(sujan);

        System.out.println(vehicles);

    }
}
