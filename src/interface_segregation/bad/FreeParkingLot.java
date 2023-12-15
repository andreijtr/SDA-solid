package interface_segregation.bad;

public class FreeParkingLot implements ParkingLot {
    @Override
    public void parkCar() {
        System.out.println("parking car...");
    }

    @Override
    public void removeCar() {
        System.out.println("removing car...");
    }

    @Override
    public int calculatePrice() {
        // do nothing because it's free but return something to no break the program
        return 0; // smells bad
    }
}
