public class Car extends Vehicles {
    int cylinderNumber;
    int speed;


    public Car(int numberOfWheels, int numberOfPassengers, int fuelCapacity, String color, int cylinderNumber, int speed) {
        super(numberOfWheels, numberOfPassengers, fuelCapacity, color,"Car", cylinderNumber,0.0,null, speed);
        this.cylinderNumber = cylinderNumber;
        this.speed = speed;
    }
    public int getCylinderNumber() {
        return cylinderNumber;
    }

    public void setCylinderNumber(int cylinderNumber) {
        this.cylinderNumber = cylinderNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    }




