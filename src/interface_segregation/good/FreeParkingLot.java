package interface_segregation.good;

public class FreeParkingLot implements ParkingLot {
    @Override
    public void parkCar() {}

    @Override
    public void removeCar() {}
}
