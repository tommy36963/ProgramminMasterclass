package section5ControlFlow;

public class Switch {
    public static void main(String[] args) {
   //     int value = 3;
    //    if(value == 1) {
     //       System.out.println("Value was 1");
     //   } else if(value == 2) {
     //       System.out.println("Value is 2");
     //   }else{
      //      System.out.println("Was not 1 or 2");
     //   }

       int switchValue =6;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;


            default:
                System.out.println("Was not 1, 2,3, 4 or 5");
                break;

        }
        char switchWord = 'Z';


        switch (switchWord) {
            case 'A':
                System.out.println("Char was A");
                break;

            case 'B':
                System.out.println("Char was A");
                break;

            case 'C':
            case 'D':
            case 'E':
                System.out.println("was a C, or a D, or a E");
                System.out.println("Actually it was a " + switchWord);
                break;

            default:
                System.out.println("Char was not found");
                break;

        }

        String month = "JANUARy";
        switch (month.toUpperCase()) {
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
                break;

        }
    }

}
