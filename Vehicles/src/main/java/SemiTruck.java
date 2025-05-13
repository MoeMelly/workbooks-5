public class SemiTruck extends Vehicles {
    double cargoCapacity;

    public SemiTruck(int numberOfWheels, int numberOfPassengers, int fuelCapacity, String color, double cargoCapacity) {
        super(numberOfWheels, numberOfPassengers, fuelCapacity, color,"Truck",200000,45000,null,120);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
public double getCargoCapacity() {
    return cargoCapacity;
}

    @Override
public void setCargoCapacity(double cargoCapacity) {
    this.cargoCapacity = cargoCapacity;
}
}


