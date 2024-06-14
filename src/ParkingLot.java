import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final List<Motorcycle> motorcycleSlots;
    private final List<Car> carSlots;
    private final List<Truck> truckSlots;

    public ParkingLot() {
        this.motorcycleSlots = new ArrayList<>(5);
        this.carSlots = new ArrayList<>(5);
        this.truckSlots = new ArrayList<>(5);
    }

    public boolean park(Vehicle vehicle) {
        if (vehicle instanceof Motorcycle) {
            if (motorcycleSlots.size() < 5) {
                motorcycleSlots.add((Motorcycle) vehicle);
                return true;
            }
        } else if (vehicle instanceof Car) {
            if (carSlots.size() < 5) {
                carSlots.add((Car) vehicle);
                return true;
            }
        } else if (vehicle instanceof Truck) {
            if (truckSlots.size() < 5) {
                truckSlots.add((Truck) vehicle);
                return true;
            }
        }
        return false;
    }

    public boolean unpark(String licensePlateNumber) {
        for (Motorcycle motorcycle : motorcycleSlots) {
            if (motorcycle.getLicensePlateNumber().equals(licensePlateNumber)) {
                motorcycleSlots.remove(motorcycle);
                return true;
            }
        }
        for (Car car : carSlots) {
            if (car.getLicensePlateNumber().equals(licensePlateNumber)) {
                carSlots.remove(car);
                return true;
            }
        }
        for (Truck truck : truckSlots) {
            if (truck.getLicensePlateNumber().equals(licensePlateNumber)) {
                truckSlots.remove(truck);
                return true;
            }
        }
        return false;
    }

    public List<Motorcycle> getMotorcycleSlots() {
        return motorcycleSlots;
    }

    public List<Car> getCarSlots() {
        return carSlots;
    }

    public List<Truck> getTruckSlots() {
        return truckSlots;
    }
}