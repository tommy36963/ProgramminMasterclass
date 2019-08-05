package section5ControlFlow;

public class SharedDigitEx {

    public static void main(String[] args) {
        System.out.println((hasSharedDigit(81,88)));

    }

    public static boolean hasSharedDigit(int number1, int number2){
        if((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)){
            return false;
        }else if((number1 % 10 == number2 % 10) || (number1 %10 == number2 / 10)){
            return true;
        } else if((number1 / 10 == number2 % 10) || (number1 / 10 == number2 / 10)){
            return true;

        }
        return false;
    }
}
