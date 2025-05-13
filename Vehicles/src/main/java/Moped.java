public class Moped extends Vehicles {
double brakingPower;


    public Moped(int numberOfWheels, int numberOfPassengers, int fuelCapacity, String color, double brakingPower) {
        super(numberOfWheels, numberOfPassengers, fuelCapacity, color,"Moped", brakingPower,0.0,null,110);
        this.brakingPower = brakingPower;
    }

    @Override
    public double getBrakingPower() {
        return brakingPower;
    }

    @Override
    public void setBrakingPower(double brakingPower) {
        this.brakingPower = brakingPower;
    }
}
