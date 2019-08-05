package section6OOP;

public class Point {
    public static void main(String[] args) {

        Point point1 = new Point(12,99);
        Point point2 = new Point(3,1);
        System.out.println("distance(0,0)= " + point1.distance());
        System.out.println("distance(second)= " + point1.distance(point2));
        System.out.println(point1.distance());
        System.out.println(point2.distance());

    }

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {

        this.x = x;
    }

    public int getY() {

        return y;
    }

    public void setY(int y) {

        this.y = y;
    }

    public double distance(){

        return distance(0,0);
    }


    public double distance(int x, int y){
        double distance = Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
        return distance;
    }
    public  double distance(Point a){
        return distance(a.x,a.y);
    }
}
