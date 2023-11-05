public class Main {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(80, 55));
        System.out.println(hasSharedDigit(1, 55));
        System.out.println(hasSharedDigit(88, 85));
        System.out.println(hasSharedDigit(63, 35));


    }

    public static boolean hasSharedDigit(int num1, int num2) {

        // input validation
        boolean firstValid = num1 > 9 && num1 < 100;
        boolean secondValid = num2 > 9 && num2 < 100;

        if (!firstValid || !secondValid) {
            return false;
        }

        // assigns variables to each digit
        int firstLeft = num1 / 10;
        int firstRight = num1 % 10;
        int secondLeft = num2 / 10;
        int secondRight = num2 % 10;

        // compares the digits
        boolean firstShared = firstLeft == secondLeft ||
                              firstLeft == secondRight;

        boolean secondShared = firstRight == secondLeft ||
                firstRight == secondRight;

        // uses the above booleans to return true or false if a digit matches
        return firstShared || secondShared;
    }
}