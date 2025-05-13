public class Hovercraft extends Vehicles{
    int numberOfFans;
    String weapons;


    public Hovercraft(int numberOfWheels, int numberOfPassengers, int fuelCapacity, String color, int numberOfFans, String weapons) {
        super(numberOfWheels, numberOfPassengers, fuelCapacity, color,"Boat",6000,70,"Fully Loaded",46);
        this.numberOfFans = numberOfFans;
        this.weapons = weapons;
    }
}
