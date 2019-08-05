package section5ControlFlow;

public class NumberToWordsEx {
    public static void main(String[] args) {
        numberToWords(99);

    }

    public static void numberToWords(int number) {

        int inputNumber = number;
        String digitToWord = "";

        int inputReversed = reverse(inputNumber);

        int normalCount = getDigitCount(inputNumber);
        int reversedCount = getDigitCount(inputReversed);
        int countDiff = normalCount - reversedCount;

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            digitToWord = "Zero";
            System.out.println(digitToWord);
        }

        for (int i = inputReversed; i > 0; i = i / 10) {

            int lastDigit = i % 10;

            if (i > 0) {

                switch (lastDigit) {

                    case 0:
                        digitToWord = digitToWord + "Zero" + " ";
                        if (i / 10 == 0) {
                            break;
                        }
                        continue;

                    case 1:
                        digitToWord = digitToWord + "One" + " ";
                        if (i / 10 == 0) {
                            break;
                        }
                        continue;

                    case 2:
                        digitToWord = digitToWord + "Two" + " ";
                        if (i / 10 == 0) {
                            break;
                        }
                        continue;

                    case 3:
                        digitToWord = digitToWord + "Three" + " ";
                        if (i / 10 == 0) {
                            break;
                        }
                        continue;

                    case 4:
                        digitToWord = digitToWord + "Four" + " ";
                        if (i / 10 == 0) {
                            break;
                        }
                        continue;

                    case 5:
                        digitToWord = digitToWord + "Five" + " ";
                        if (i / 10 == 0) {
                            break;
                        }
                        continue;

                    case 6:
                        digitToWord = digitToWord + "Six" + " ";
                        if (i / 10 == 0) {
                            break;
                        }
                        continue;

                    case 7:
                        digitToWord = digitToWord + "Seven" + " ";
                        if (i / 10 == 0) {
                            break;
                        }
                        continue;

                    case 8:
                        digitToWord = digitToWord + "Eight" + " ";
                        if (i / 10 == 0) {
                            break;
                        }
                        continue;

                    case 9:
                        digitToWord = digitToWord + "Nine" + " ";
                        if (i / 10 == 0) {
                            break;
                        }
                        continue;
                }
                if (i / 10 == 0) {

                    if (normalCount != reversedCount) {
                        int addingZeroes = 0;

                        while (addingZeroes != countDiff ) {
                            digitToWord = digitToWord + "Zero" + " " ;
                            addingZeroes++;
                        }
                    }
                    System.out.println(digitToWord);
                }
            }
        }

    }

    public static int reverse(int numToBeReversed) {
        int workingNum = numToBeReversed;
        int workingDigit;
        int reversedNum = 0;

        while(workingNum != 0) {

            workingDigit = workingNum % 10;
            reversedNum = reversedNum * 10 + workingDigit;
            workingNum = workingNum / 10;
        }
        return reversedNum;
    }

    public static int getDigitCount(int number) {

        int testingNum = number;
        int count = 0;

        if(number < 0) {
            count = -1;
            return count;
        }
        if(number == 0) {
            count = 1;
            return count;
        }
        else {

            for (int j = testingNum; j > 0; ) {
                j = j / 10;
                count++;
            }
        }
        return count;
    }
}
