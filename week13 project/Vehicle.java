public class Vehicle {
    protected int speed; // Accessible to subclasses
    private double fuel; // Private to Vehicle

    // Constructor
    public Vehicle(int speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    // Start method
    public void start() {
        System.out.println("The vehicle has started.");
    }

    // Stop method
    public void stop() {
        System.out.println("The vehicle has stopped.");
    }

    // Final displayFuel method
    public final void displayFuel() {
        System.out.println("Fuel level: " + fuel + " liters");
    }

    // Getter and Setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter and Setter for fuel
    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
