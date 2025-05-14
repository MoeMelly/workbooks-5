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
        double depreciationRate = 0;


        if (carAge <= 1) {
            depreciationRate = 0.20;
        }
        else if (carAge <= 3) {
            depreciationRate = 0.35;
            System.out.println("Reducing value of \"" + make + "\" by 3%.");

        } else if (carAge <= 6) {
           depreciationRate = 0.60;
            System.out.println("Reducing value of \"" + make + "\" by 6%. New Value: " + depreciationRate);

        } else if (carAge <= 10) {
            depreciationRate = 0.65;
            System.out.println("Reducing value of \"" + make + "\" by 8%. New Value: " + depreciationRate);


            if (odometer > 100000 && !make.contains("Honda") && !make.contains("Toyota")) {
               depreciationRate += 0.75;


            }

        }

        return Math.min(depreciationRate,0.95);
    }




    @Override
    public double getValues() {
        return 0;
    }

    @Override
    public double getValue(double originalCost, int carAge, int odometer, String make) {
            double depreciationRate = getDepreciationRate();
            return originalCost * Math.pow((1 - depreciationRate), carsYears);
        }

    private double getDepreciationRate() {
        return 0;
    }
 }






