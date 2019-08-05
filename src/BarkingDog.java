public class BarkingDog {

    public static void main(String[] args) {
        boolean wake = shouldWakeUp(true,3);
        System.out.println("wake up " + wake);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay ){
        if(hourOfTheDay < 0 || hourOfTheDay > 23){
            return false;
        }else if(barking && hourOfTheDay < 8 || barking && hourOfTheDay > 22){
            return true;
        }else {
            return false;
        }


    }
}
