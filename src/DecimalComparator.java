public class DecimalComparator {

    public static void main(String[] args) {
        boolean match = areEqualByThreeDecimalPlaces(3.456, 3.4567);
        System.out.println("Are equal by three decimal places " + match);

    }

    public static boolean areEqualByThreeDecimalPlaces(double decimalOne, double decimalTwo) {

        if((int)(decimalOne * 1000) ==(int)(decimalTwo * 1000)){
            return true;

        }else{
            return false;
        }


    }
}
