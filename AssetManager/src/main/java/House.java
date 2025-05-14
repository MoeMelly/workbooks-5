public class House extends Asset {
    String address;
    int condition;
    int squareFoot;
    int lotSize;


    public House(String address, int condition,int squareFoot,int lotSize,String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }


    public double evaluatedHouseValue(double houseValue, double lotSize) {
        if (houseValue == 180) {
            System.out.println("House Value is Excellent!");
        } else if (houseValue == 130) {
            System.out.println("House Value is good");

        } else if (houseValue == 90) {
            System.out.println("House value is fair");

        } else if (houseValue == 80) {
            System.out.println("House value");

        } else {
            System.out.println("House Value Cannot be evaluated");
        }

        double lus = 0.25 * lotSize;

        System.out.println("Land use Surcharge (LUS): $" + lus);

        return houseValue;
    }
}










