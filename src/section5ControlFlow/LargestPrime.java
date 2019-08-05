package section5ControlFlow;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));

    }

    public static int getLargestPrime(int number) {
        if (number <= 0)
            return -1;
        else {
            int largestPrime = -1;
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    int count = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0)
                            count++;
                    }
                    if (count == 2)
                        largestPrime = i;
                }
            }
            return largestPrime;
        }
    }
}
