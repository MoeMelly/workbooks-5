import java.math.BigDecimal;

public class LeaseContract extends Contract {
    private BigDecimal endingValue;
    private BigDecimal leaseFee;

    public LeaseContract(double monthlyPayment, double totalPrice, boolean vehiclesSold, String customerName, String dateOfContract) {
        super(monthlyPayment, totalPrice, vehiclesSold, customerName, dateOfContract);
        this.endingValue = BigDecimal.ZERO;
        this.leaseFee = BigDecimal.ZERO;
    }



    public BigDecimal getEndingValue() {
        return endingValue;
    }

    public void setEndingValue(BigDecimal endingValue) {
        this.endingValue = endingValue;
    }

    public BigDecimal getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(BigDecimal leaseFee) {
        this.leaseFee = leaseFee;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }


    public BigDecimal calculateTotalLeaseCost(int numberOfMonths) {
        return BigDecimal.valueOf(monthlyPayment)
                .multiply(BigDecimal.valueOf(numberOfMonths))
                .add(leaseFee);
    }

    @Override
    public String toString() {
        return "LeaseContract{" +
                "endingValue=" + endingValue +
                ", leaseFee=" + leaseFee +
                ", monthlyPayment=" + monthlyPayment +
                '}';
    }
}