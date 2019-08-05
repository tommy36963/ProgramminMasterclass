package section5ControlFlow;

public class Sum3and5Challenge {


    //create a for statement usuing a range of numbers from 1 to 1000
    // SUM all the numbers that can be divided with both 3 and also 5 and print out the number
    // break out the loop once you have 5 numbers that break these conditions
    // Then print out the sum of numbers that met these conditions

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for(int i = 1; i <= 1000; i++){
            if((i % 7 == 0) &&(i % 5 == 4)){
                count++;
                sum += i;
                System.out.println("Found number = " + i);

            }
            if(count == 10){
                break;
            }
        }

        System.out.println("Sum =" + sum);
    }
}
