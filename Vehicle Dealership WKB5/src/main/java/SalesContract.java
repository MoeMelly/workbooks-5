import java.math.BigDecimal;

public class SalesContract extends Contract {
    BigDecimal salesTax;
    BigDecimal recordingFee;
    BigDecimal processingFee;
    boolean willFinance = false;



    public SalesContract(double monthlyPayment, double totalPrice, boolean vehiclesSold, String customerName, String dateOfContract, BigDecimal salesTax, BigDecimal recordingFee, BigDecimal processingFee, boolean willFinance) {
        super(monthlyPayment, totalPrice, vehiclesSold, customerName, dateOfContract);
        this.salesTax = salesTax;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.willFinance = willFinance;
    }


    public BigDecimal getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(BigDecimal salesTax) {
        this.salesTax = salesTax;
    }

    public BigDecimal getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(BigDecimal recordingFee) {
        this.recordingFee = recordingFee;
    }

    public BigDecimal getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(BigDecimal processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isWillFinance() {
        return willFinance;
    }

    public void setWillFinance(boolean willFinance) {
        this.willFinance = willFinance;
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        totalPrice += salesTax.doubleValue() + recordingFee.doubleValue() + processingFee.doubleValue();

        


        return totalPrice;
    }

    @Override
    public double getMonthlyPayment() {
        double totalPrice = getTotalPrice();
        double interestRate = willFinance ? 0.0425 : 0.0;
        int numberOfPayments = 48;
        double monthlyInterestRate = interestRate / 12;


        return (totalPrice * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
    }



}