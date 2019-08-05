package section5ControlFlow;

public class EvenDigitSumExercise {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2345678));

    }

    public static int getEvenDigitSum(int number){
        if (number <0){
            return -1;
        }else{
            int sum = 0;
            while (number>0){
                int lastDigit = number % 10;
                if(lastDigit%2==0){
                    sum = sum + lastDigit;
                }
                number = number / 10;
            }
            return sum;
        }
    }
}
