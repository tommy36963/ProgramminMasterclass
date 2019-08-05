package section5ControlFlow;

// method sumDigits one int parameter called number
// if parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate a invalid value
// numbers from 0-9 have 1 digit so dont process them, also dont process negative number, so return -1 for negative number
// e.g. calling method sumDigits(125) should return 8 since 1 +2 +5 = 8
// calling method sumDigits(1) should return -1


public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of digits in number 125 is " + sumDigits(-125));
        System.out.println("The sum of digits in number 125 is " + sumDigits(4));
        System.out.println("The sum of digits in number 125 is " + sumDigits(32123));
    }


    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }

        int sum = 0;

        // 125 -> 125 / 10 = 12 * 10 = 120 -120 = 5

        while (number > 0) {
            // extract the least significant digit
            int digit = number % 10; // digit = 5
            sum += digit;

            //drop least significant digit
            number/= 10; // number = number / 10;


        }
        return sum;
    }

}