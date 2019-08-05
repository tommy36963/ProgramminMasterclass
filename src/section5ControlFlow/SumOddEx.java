package section5ControlFlow;

public class SumOddEx {

    public static void main(String[] args) {
        System.out.println("Number is odd " + (isOdd(8)));
        System.out.println((sumOdd(10,5)));

    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;

        } else if (number % 2 == 0) {
            return false;


        } else {
            return true;
        }

    }


    public static int sumOdd(int start, int end) {

        int i;
        int sum = 0;


        if (start <= 0 || end <= 0 || start > end) {
            return -1;
        }

        for (i = start; i <= end; i++) {
            if (isOdd(i) == true) {
                sum += i;
            }
        }
        return sum;

    }
}