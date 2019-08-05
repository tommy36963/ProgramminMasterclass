package section5ControlFlow;

public class PalindromeExcercise {


    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int n = 0;


        while (palindrome > 0) {
            int remainder = palindrome % 10;  /// e.g. remainder = 1 if palindrome is 121, 1, 1
            n = n * 10 + remainder;  // 0 * 10 + 1 = 1, 11, 111
            palindrome = palindrome / 10; // 121 = 121 / 10 which = 12, 1, 0
        }


        if (number == n) {
            return true;
        }

        return false;
    }
}
