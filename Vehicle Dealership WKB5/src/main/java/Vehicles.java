import java.util.AbstractList;
import java.util.StringJoiner;

public class Vehicles {
    String type;
    String fuelType;
    String Make;
    String model;
    String trim;
    String color;
    String vin;
    int odometer;
    int year;
    double price;
    boolean carIsAvailable;


    public Vehicles(String type, String fuelType, String Make, String model, String trim, String color, String vin, int year, int odometer, double price, boolean carIsAvailable) {
        this.type = type;
        this.fuelType = fuelType;
        this.Make = Make;
        this.model = model;
        this.trim = trim;
        this.color = color;
        this.vin = vin;
        this.year = year;
        this.odometer = odometer;
        this.price = price;
        this.carIsAvailable = carIsAvailable;
    }


    public boolean isAvailable() {
        if (carIsAvailable) {
            System.out.println("Vehicle Available for purchase.");
        } else {
            System.out.println("Car is not Available for purchase.");
        }


        return false;
    }

    public void setAvailable(boolean available) {
        carIsAvailable = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new RuntimeException("Price Can't Be Negative.");
        }


        this.price = price;
    }

    public int getYear() {


        return year;
    }

    public void setYear(int year) {


        this.year = year;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return Make;
    }

    public void setBrand(String brand) {
        this.Make = Make;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }


    @Override
    public String toString() {
        return new StringJoiner(" | ")
                .add("♠ M & K's Exotics ♠|980 Old Martin Rd|876-154-6537")
                .add("Fuel Type: " + fuelType)
                .add("Brand: " + Make)
                .add("Model: " + model)
                .add("Trim: " + trim)
                .add("Color" + color)
                .add("Vin" + vin)
                .add("Odometer" + odometer)
                .add("Year: " + year)
                .add("Price: $" + price)
                .add("Available: " + carIsAvailable)
                .toString();
    }


    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }


    public AbstractList<Vehicles> add(Vehicles vehicle) throws Exception {

        return VehicleManager.getVehicles();

    }
}


















