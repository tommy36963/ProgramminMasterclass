package section5ControlFlow;

public class DiagonalStarEx {

    public static void main(String[] args) {
        printSquareStar(5);

    }

    public static void printSquareStar(int number) {


        if (number < 5) {
            System.out.print("Invalid Value");
            return;
        }

        for (int r = 1; r <= number; r++) {
            for (int c = 1; c <= number; c++) {
                if ((c == 1 || c == number) || (r == 1 || r == number)) {
                    System.out.print("*");
                } else if (c == r) {
                    System.out.print("*");
                } else if (c == (number - r + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}





