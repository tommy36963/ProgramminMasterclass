public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean teenAges = hasTeen(0, 0, 13);
        System.out.println("Are they teenagers : " + teenAges);

        boolean teenAgesTwo = isTeen(9);
        System.out.println("Is a teenager : " + teenAgesTwo);

    }

    public static boolean hasTeen(int teenOne, int teenTwo, int teenThree) {
        if ((teenOne >= 13 && teenOne <= 19) || (teenTwo >= 13 && teenTwo <= 19) || (teenThree >= 13 && teenThree <= 19)) {
            return true;

        } else {
            return false;
        }

    }

    public static boolean isTeen(int newTeen) {
        if (newTeen > 12 && newTeen < 20) {
            return true;

        } else {
            return false;
        }
    }

}
