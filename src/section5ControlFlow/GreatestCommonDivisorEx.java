package section5ControlFlow;

public class GreatestCommonDivisorEx {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(10,15));

    }
    public static int getGreatestCommonDivisor(int fisrt, int second){
        if(fisrt < 10 || second < 10){
            return -1;
        }else {
            while (fisrt != second){  // 25 not equal to 15
                if( fisrt > second){   // 25 greater than 15
                    fisrt = fisrt - second;  // 25 = 25 -15 which equals 10
                }else {
                    second = second - fisrt;
                }


            }
            return fisrt;
        }
    }
}
