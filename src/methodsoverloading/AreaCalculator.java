package methodsoverloading;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println((area(4.2)));
        System.out.println((area(5.0,4.5)));

    }
    public static double area(double radius) {
        if (radius <= -1) {
            System.out.println("Invalid value");
            return -1;


        }

        return Math.PI * radius * radius;

    }

        public static double area(double x, double y){
            if((x <= -1) || (y <= -1)){
                System.out.println("Invalid value");
                return -1;


            }
            return x * y;


    }
}
