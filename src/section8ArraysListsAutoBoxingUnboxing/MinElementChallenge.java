package section8ArraysListsAutoBoxingUnboxing;

import java.util.Scanner;

public class MinElementChallenge {



    // 1. Write a method called readIntegers with a parameter called count that represents how many integers the user needs to enter
    //2. write method findMin with the array as a parameter. Method needs to return min value element of numbers enetered
    //3. In main method read the count from console and call readIntergers method with the count parameter.
    //4. Call findMin method passing the array returned from  the call to the readIntegers method
    // 5. Print min element in the array

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] reurnedArray = readIntegers(count);
        int returnedMin = findMin(reurnedArray);

        System.out.println("min = " + returnedMin);





    }

    public static int [] readIntegers(int count){

        int[] input = new int[count];
        for(int i = 0; i < count; i++){
            System.out.println("Please Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            input[i] = number;
        }
        return input;

    }

    private static int findMin(int[] array){
        int findMin = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < findMin) {
                findMin = array[i];
            }
        }



        return findMin;
    }
}
