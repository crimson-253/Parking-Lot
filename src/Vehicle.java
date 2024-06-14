public abstract class Vehicle {
    private String licensePlateNumber;
    private String companyName;

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