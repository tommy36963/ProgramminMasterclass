package section8ArraysListsAutoBoxingUnboxing;

// Create a program with using arrays which sorts the integers in descending order high to low
// Numbers are read from keyboard so use scanner
// 3 methods: getIntegers, printArray, sortIntegers
// getIntergers = returns array of entered integers
// printArray = prints out contents of array
// sortIntergers = sorts array and return a new array containing sorted numbers

import java.util.Arrays;
import java.util.Scanner;

public class ArraryChallenge1 {

   private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int [] myIntArray = getIntegers(8);
        int[] sorted = sortIntegers(myIntArray);
        printArray(sorted);


    }

    public static int[] getIntegers(int capacity){
        System.out.println("Please Enter " + capacity + " numbers.\r");
        int[] userInput = new int[capacity];
        for(int i=0; i < userInput.length; i++) {
            userInput[i] = scanner.nextInt();
        }
        return userInput;
    }
    public static void printArray(int[] userInput){
        for(int i=0; i < userInput.length; i++){
            System.out.println("Element " + i + " contents " + userInput[i]);
        }

    }

    public static int [] sortIntegers(int [] userInput){
      //  int[] sortedArray = new int[userInput.length]; //creating a new array
      //  for(int i = 0; i < userInput.length; i++){     // copying numbers to new array
      //      sortedArray[i] = userInput[i];             //
      //  }

        int [] sortedArray = Arrays.copyOf(userInput, userInput.length); // alternate method easier more advance

        //sorts arrays in descending order
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i <sortedArray.length-1;i++){
                if(sortedArray[i] < sortedArray[i +1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }



    }

