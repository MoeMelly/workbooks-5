public abstract class Contract {
    String dateOfContract;
    String customerName;
    boolean vehiclesSold;
    double totalPrice;
    double monthlyPayment;


    public Contract(double monthlyPayment, double totalPrice, boolean vehiclesSold, String customerName, String dateOfContract) {
        this.monthlyPayment = monthlyPayment;
        this.totalPrice = totalPrice;
        this.vehiclesSold = vehiclesSold;
        this.customerName = customerName;
        this.dateOfContract = dateOfContract;
    }


    public String getDateOfContract() {
        return dateOfContract;
    }

    public void setDateOfContract(String dateOfContract) {
        this.dateOfContract = dateOfContract;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean isVehiclesSold() {
        return vehiclesSold;
    }

    public void setVehiclesSold(boolean vehiclesSold) {
        this.vehiclesSold = vehiclesSold;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public abstract double getTotalPrice();


    public abstract double getMonthlyPayment();
}





















