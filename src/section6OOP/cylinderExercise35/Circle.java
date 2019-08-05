package section6OOP.cylinderExercise35;

public class Circle {

    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        System.out.println("circle.getRadius = " + circle.getRadius());
        System.out.println("circle.getARea = " + circle.getArea());
        Cylinder cylinder = new Cylinder(4.5,9.7);
        System.out.println("cylinder.getRadius = " + cylinder.getRadius());
        System.out.println("cylinder.getRadius = " + cylinder.getHeight());
        System.out.println("cylinder.getRadius = " + cylinder.getArea());
        System.out.println("cylinder.getRadius = " + cylinder.getVolume());

    }

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        if(radius < 0){
            this.radius = 0.0;
        }else{
            this.radius = radius;
        }
    }

    public double getRadius() {
        if(radius < 0){
            radius = 0.0;
        }
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
