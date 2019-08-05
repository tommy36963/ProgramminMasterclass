package section5ControlFlow;

public class WhileAndDoWhilePlusEx {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(7));



        // Create a method calles isEvenNumber that takes a parameter int
        // Its purpose is to determine if the arguement passed to the method is an even number or not
        // return true if even, otherwise return false
        // Make it also record the total numbers of even numbers found and break once 5 are found
        // and at the end, display the total number of even numbers found

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;


        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }

        }
        System.out.println("Total Even numbers found = " + evenNumbersFound);

    }

    public static boolean isEvenNumber( int number){
        if (number % 2 == 0){
            return true;
        }else {
            return false;
        }

    }
}
