package section5ControlFlow;

import java.util.Scanner;

// Get user to enter 10 numbers and add the sum of all numbers

public class ReadingUserInputChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true){
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = sc.hasNextInt();

            if(isAnInt){
                int number = sc.nextInt();
                counter++;
                sum = sum + number;
                if(counter == 10){
                    break;
                }

            }else{
                System.out.println("Invalid number");
            }

            sc.nextLine();
        }
        System.out.println("sum = " + sum);
        sc.close();
    }
}
