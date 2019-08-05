package section6OOP.inheritanceChallenge1;

public class Car extends Vehicle {

    private boolean isRwd;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;



    public Car(String name, String size, boolean isRwd, int doors, int gears, boolean isManual) {
        super(name, size);
        this.isRwd = isRwd;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): changed to " + this.currentGear + " gear. ");
    }

    public void changeSpeed(int velocity, int direction){

        System.out.println("Car.changeSpeed(): Speed " + velocity + " direction "+ direction);
        move(velocity, direction);
    }


}
