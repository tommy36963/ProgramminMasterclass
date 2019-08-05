package section6OOP.inheritanceChallenge1;

public class Vehicle {

    public static void main(String[] args) {
        M3 m3 = new M3(550);
        m3.steer(45);
        m3.accelerate(72);
        m3.accelerate(30);
        m3.accelerate(-50);



    }

    private String name;
    private String size;
    private int currentSpeed;
    private int currentDirection;


    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + "degrees.");

    }

    public void move(int speed, int direction) {
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentSpeed + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentSpeed = 0;
    }
}
