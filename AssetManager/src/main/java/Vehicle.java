public class Vehicle extends Asset {
    String make;
    String model;
    int odometer;
    int carsYears;




    public Vehicle(String description, String dateAcquired, double originalCost, String make, String model, int odometer, int carsYears) {
        super(description, dateAcquired, originalCost);
        this.make = make;
        this.model = model;
        this.carsYears = carsYears;
        this.odometer = odometer;
    }








    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }


    public double reducedPrice(double originalCost, int carAge, int odometer, String make) {
        double reducedValue = 0;

        if (carAge <= 3) {
             reducedValue = 0.03;
            System.out.println("Reducing value of \"" + make + "\" by 3%.");

        } else if (carAge <= 6) {
            reducedValue = 0.06;
            System.out.println("Reducing value of \"" + make + "\" by 6%. New Value: " + reducedValue);

        } else if (carAge <= 10) {
            reducedValue = 0.08;
            System.out.println("Reducing value of \"" + make + "\" by 8%. New Value: " + reducedValue);





            if (odometer > 100000 && !make.contains("Honda") && !make.contains("Toyota")) {
                reducedValue += 0.75;
                System.out.println("High mileage detected on a non-Honda/Toyota vehicle - value significantly reduced.");

            }

        }
        double depreciatedValue = originalCost * Math.pow((1 - reducedValue), carAge);
        return reducedValue;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Calls the Asset's displayInfo method
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Mileage: " + odometer);
        System.out.println("Years Owned: " + carsYears);
    }
}



