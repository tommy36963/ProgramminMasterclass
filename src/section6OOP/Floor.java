package section6OOP;

public class Floor {

    public static void main(String[] args) {
        Floor floor = new Floor(5.5,10);
        System.out.println("Total area = " + floor.getArea());
        Carpet carpet = new Carpet(2);
       Calculator calculator = new Calculator(floor,carpet);
       System.out.println("Total = " + calculator.getTotalCost());

    }

    private double width;
    private double length;

    public Floor(double width, double length) {

        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

        public double getArea() {
            return this.width * this.length;
        }
    }