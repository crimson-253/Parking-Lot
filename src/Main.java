import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        Status status = new Status(parkingLot);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Park a vehicle");
            System.out.println("2. Unpark a vehicle");
            System.out.println("3. Show Parkinglot status");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter license plate number: ");
                    String licensePlateNumber = scanner.next();
                    System.out.print("Enter company name: ");
                    String companyName = scanner.next();
                    System.out.print("Enter vehicle type (Motorcycle, Car, Truck): ");
                    String vehicleType = scanner.next();
                    Vehicle vehicle;
                    if (vehicleType.equalsIgnoreCase("Motorcycle")) {
                        vehicle = new Motorcycle(licensePlateNumber, companyName);
                    } else if (vehicleType.equalsIgnoreCase("Car")) {
                        vehicle = new Car(licensePlateNumber, companyName);
                    } else if (vehicleType.equalsIgnoreCase("Truck")) {
                        vehicle = new Truck(licensePlateNumber, companyName);
                    } else {
                        System.out.println("Invalid vehicle type!");
                        continue;
                    }
                    if (parkingLot.park(vehicle)) {
                        System.out.println("Vehicle parked successfully!");
                    } else {
                        System.out.println("Parking lot is full!");
                    }
                    break;
                case 2:
                    System.out.print("Enter license plate number: ");
                    String unparkLicensePlateNumber = scanner.next();
                    if (parkingLot.unpark(unparkLicensePlateNumber)) {
                        System.out.println("Vehicle unparked successfully!");
                    } else {
                        System.out.println("Vehicle not found!");
                    }
                    break;
                case 3:
                    status.showStatus();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}