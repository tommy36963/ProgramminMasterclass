public class EqualSumChecker {

    public static void main(String[] args) {
        boolean equalToThree = hasEqualSum(4,7,8);
        System.out.println("Sum is equal to int three: " + equalToThree);

    }

    public static boolean hasEqualSum(int one, int two, int three){
        if(one + two == three){
            return true;
        }else{
            return false;
        }

    }
}
