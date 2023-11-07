package interface_segregation.bad;

public class FreeParkingLot implements ParkingLot {
    @Override
    public void parkCar() {}

    @Override
    public void removeCar() {}

    @Override
    public int calculatePrice() {
        return 0; // smells bad
    }
}
