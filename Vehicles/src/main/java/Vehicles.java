public class Vehicles {
    int numberOfWheels;
    int numberOfPassengers;
    int fuelCapacity;
    String color;
    String vehicleType;
    double brakingPower;
    double cargoCapacity;
    String weapons;


    public Vehicles(int numberOfWheels, int numberOfPassengers, int fuelCapacity, String color, String vehicleType, double brakingPower, double cargoCapacity, String weapons,int speed) {
        this.numberOfWheels = numberOfWheels;
        this.numberOfPassengers = numberOfPassengers;
        this.fuelCapacity = fuelCapacity;
        this.color = color;
        this.vehicleType = vehicleType;
        this.brakingPower = brakingPower;
        this.cargoCapacity = cargoCapacity;
        this.weapons = weapons;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getBrakingPower() {
        return brakingPower;
    }

    public void setBrakingPower(double brakingPower) {
        this.brakingPower = brakingPower;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }
    @Override
    public String toString() {
        return String.format(
                "========== %s ==========%n" +
                        "Color      : %s%n" +
                        "Wheels     : %d%n" +
                        "Passengers : %d%n" +
                        "Fuel       : %d L%n" +
                        "Braking    : %.2f%n" +
                        "Cargo      : %.2f kg%n" +
                        "Weapons    : %s%n",
                vehicleType.toUpperCase(), color, numberOfWheels, numberOfPassengers,
                fuelCapacity, brakingPower, cargoCapacity, weapons
        );
    }

}











