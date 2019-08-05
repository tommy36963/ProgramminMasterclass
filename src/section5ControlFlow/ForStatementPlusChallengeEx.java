package section5ControlFlow;

public class ForStatementPlusChallengeEx {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        // using the for statement, call the calculateInterest method with the amount
        // of 10000 with an interestRate of 2 -8% and print the results
        for (int i = 2; i < 9; i++) {
            System.out.println("10,0000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }

        // Modify the for loop above to do the same thing as shown but start from 8% and work back to 2%
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,0000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }


    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));


    }




    {

    }

    {
        int count = 0;
        for(int i=10; i<50; i++)
        if (isPrime(i)) {
            count++;
            System.out.println("Number " + i + " is a prime number");
            if (count == 10) {
                System.out.println("Exiting for loop");
                break;
            }
        }
    }


    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            return false;
        }
        return true;
    }


}

