package interface_segregation.good;

public class FreeParkingLot implements ParkingLot {
    @Override
    public void parkCar() {
        System.out.println("parking car..");
    }

    @Override
    public void removeCar() {
        System.out.println("removing car..");
    }
}
