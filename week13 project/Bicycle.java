public class Bicycle extends Vehicle {
    private boolean hasBell;

    // Constructor
    public Bicycle(int speed, double fuel, boolean hasBell) {
        super(speed, fuel); // Call the Vehicle constructor
        this.hasBell = hasBell;
    }

    // Override start method
    @Override
    public void start() {
        System.out.println("The bicycle has started. Pedal away!");
    }

    // Ring bell method
    public void ringBell() {
        if (hasBell) {
            System.out.println("Ring Ring!");
        } else {
            System.out.println("This bicycle has no bell.");
        }
    }

    // Getter and Setter for hasBell
    public boolean isHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }
}
