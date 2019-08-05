package section6OOP.poolAreaEx36;

public class Rectangle {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1.0,0.0);
        System.out.println("rectangle.getWidth =" + rectangle.getWidth());
        System.out.println("rectangle.getLength =" + rectangle.getLength());
        System.out.println("rectangle.getArea =" + rectangle.getArea());
        Cuboid cuboid = new Cuboid(15.8,22.0,14.5);
        System.out.println("cuboid.getWidth =" + cuboid.getWidth());
        System.out.println("cuboid.getLength =" + cuboid.getLength());
        System.out.println("cuboid.getArea =" + cuboid.getArea());
        System.out.println("cuboid.getHeight =" + cuboid.getHeight());
        System.out.println("cuboid.getVolume =" + cuboid.getVolume());


    }

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if(width < 0){
            this.width = 0;
        }else{
            this.width = width;
        }
        if(length < 0){
            this.length = 0;
        }else{
            this.length = length;

        }


    }

    public double  getLength() {

        return length;

    }

    public double getWidth() {

        return width;
    }

    public double getArea(){
        return width * length;
    }
}