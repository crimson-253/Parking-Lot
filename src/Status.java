public class Status {
    private ParkingLot parkingLot;

    public Status(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void showStatus() {
        System.out.println("Parking Lot Status:");
        System.out.println("Motorcycle slots: " + parkingLot.getMotorcycleSlots().size() + "/5");
        System.out.println("Car slots: " + parkingLot.getCarSlots().size() + "/5");
        System.out.println("Truck slots: " + parkingLot.getTruckSlots().size() + "/5");
        System.out.println("Vehicles:");
        for (Motorcycle motorcycle : parkingLot.getMotorcycleSlots()) {
            System.out.println("License Plate Number: " + motorcycle.getLicensePlateNumber());
            System.out.println("Company Name: " + motorcycle.getCompanyName());
            System.out.println("Vehicle Type: Motorcycle");
            System.out.println();
        }
        for (Car car : parkingLot.getCarSlots()) {
            System.out.println("License Plate Number: " + car.getLicensePlateNumber());
            System.out.println("Company Name: " + car.getCompanyName());
            System.out.println("Vehicle Type: Car");
            System.out.println();
        }
        for (Truck truck : parkingLot.getTruckSlots()) {
            System.out.println("License Plate Number: " + truck.getLicensePlateNumber());
            System.out.println("Company Name: " + truck.getCompanyName());
            System.out.println("Vehicle Type: Truck");
            System.out.println();
        }
    }
}