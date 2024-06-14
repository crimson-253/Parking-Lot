public abstract class Vehicle {
    private final String licensePlateNumber;
    private final String companyName;

    public Vehicle(String licensePlateNumber, String companyName) {
        this.licensePlateNumber = licensePlateNumber;
        this.companyName = companyName;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public String getCompanyName() {
        return companyName;
    }
}