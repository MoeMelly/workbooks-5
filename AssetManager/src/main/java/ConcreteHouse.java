import java.text.NumberFormat;
import java.util.Locale;


public class ConcreteHouse extends House {
    public ConcreteHouse(String address, int condition, int squareFoot, int lotSize,
                         String description, String dateAcquired, double originalCost) {
        super(address, condition, squareFoot, lotSize, description, dateAcquired, originalCost);
    }

    @Override
    public double evaluatedHouseValue() {
        double basePricePerSqFt = 177;
        double conditionMultiplier = 1.0 + (getCondition() - 3) * 0.05;
        double lotSizeMultiplier = 1.0 + Math.min(getLotSize(), 20000) / 10000.0;
        return getSquareFoot() * basePricePerSqFt * conditionMultiplier * lotSizeMultiplier;
    }


    @Override
    public double getValues() {
        return evaluatedHouseValue();
    }

    @Override
    public double getValue(double originalCost, int carAge, int odometer, String make) {
        return 0;
    }

    @Override
    public double getValue() {
        return evaluatedHouseValue();
    }



    @Override
    public void displayInfo() {

        System.out.println("Address: " + getAddress());
        System.out.println("Condition: " + getCondition());
        System.out.println("Square Footage: " + getSquareFoot());
        System.out.println("Lot Size: " + getLotSize());
        System.out.println("Description: " + getDescription());
        System.out.println("Date Acquired: " + getDateAcquired());
    }

}

