public class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor
    public Car(int speed, double fuel, int numberOfDoors) {
        super(speed, fuel); // Call the Vehicle constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Override start method
    @Override
    public void start() {
        System.out.println("The car has started. Ready to drive!");
    }

    // Honk method
    public void honk() {
        System.out.println("Beep Beep!");
    }

    // Getter and Setter for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
