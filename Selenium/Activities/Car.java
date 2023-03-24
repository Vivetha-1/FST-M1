package ActivityJava;

public class Car {

    String color;
    int make;
    String transmission;
    int tyres;
    int doors;

    //Constructor
    Car() {
        tyres = 4;
        doors = 4;
    }

    //Class Methods
    public void displayCharacteristics() {
        System.out.println("Color " + color);
        System.out.println("Make car " + make);
        System.out.println("Transmission " + transmission);
        System.out.println("Number of doors  " + doors);
        System.out.println("Number of tyres " + tyres);
    }

    public void accelerate() {
        System.out.println("Car is moving forward.");
    }

    public void brake() {
        System.out.println("Car has stopped.");
    }
}
