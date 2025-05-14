public class Asset {
    String description;
    String dateAcquired;
    double originalCost;


    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    public double getValue() {
        return originalCost;
    }
    public void displayInfo() {
        System.out.println("Asset Information");
        System.out.println("------------------");
        System.out.printf("%-15s : %s%n", "Description",   description);
        System.out.printf("%-15s : %s%n", "Date Acquired", dateAcquired);
        System.out.printf("%-15s : $%,10.2f%n", "Original Cost", originalCost);
        System.out.printf("%-15s : $%,10.2f%n", "Current Value", getValue());
    }

}






