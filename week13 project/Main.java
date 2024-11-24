public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car(120, 50.0, 4);
        System.out.println("Car Details:");
        myCar.start();
        myCar.displayFuel();
        myCar.honk();
        System.out.println("Number of Doors: " + myCar.getNumberOfDoors());
        myCar.stop();
        System.out.println();

        // Create a Bicycle object
        Bicycle myBike = new Bicycle(20, 0.0, true);
        System.out.println("Bicycle Details:");
        myBike.start();
        myBike.displayFuel();
        myBike.ringBell();
        System.out.println("Has Bell: " + myBike.isHasBell());
        myBike.stop();
    }
}
