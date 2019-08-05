package section6OOP;

public class ComplexNumber {

    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(4.0,3.0);
        ComplexNumber two = new ComplexNumber(8.0,9.0);
        one.add(1,1);
        System.out.println(one.getReal());
        System.out.println(one.getImaginary());
        two.subtract(one);
        System.out.println(two.getReal());
        System.out.println(two.getImaginary());

    }

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;

    }

    public void add(ComplexNumber complexNumber){
        add(complexNumber.real, complexNumber.imaginary);

    }

    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -=imaginary;

    }

    public void subtract(ComplexNumber complexNumber){
      subtract(complexNumber.real, complexNumber.imaginary);

    }
}
