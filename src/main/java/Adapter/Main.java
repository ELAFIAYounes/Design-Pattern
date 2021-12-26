package Adapter;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new BicycleAdapter(new Bicycle());
        userVehicle(car);
    }

    private static void userVehicle(Vehicle vehicle) {
        vehicle.accelerate();
        vehicle.soundHorn();
        vehicle.pushBreak();
    }
}
