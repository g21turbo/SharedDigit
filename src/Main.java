public class Main {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(10, 99));

    }

    public static boolean hasSharedDigit(int num1, int num2) {

        boolean firstValid = num1 > 9 && num1 < 100;
        boolean secondValid = num2 > 9 && num2 < 100;

        if (!firstValid || !secondValid) {
            return false;
        }

//    --------previous input validation-----------
//        if (num1 < 10 || num1 > 99 ||
//                num2 < 10 || num2 > 99) {
//            return false;
//        }

        while (num1 > 10 && num2 > 10) {
            int remDigit1 = num1 % 10;
            int remDigit2 = num2 % 10;

            if (remDigit1 == remDigit2) {
                return true;
            }
        }
        return true;
    }
}