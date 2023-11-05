public class Main {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(80, 55));
        System.out.println(hasSharedDigit(1, 55));
        System.out.println(hasSharedDigit(88, 85));
        System.out.println(hasSharedDigit(63, 35));


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


        int firstLeft = num1 / 10;
        int firstRight = num1 % 10;
        int secondLeft = num2 / 10;
        int secondRight = num2 % 10;

        boolean firstShared = firstLeft == secondLeft ||
                              firstLeft == secondRight;

        boolean secondShared = firstRight == secondLeft ||
                firstRight == secondRight;


        // ---- tried with a while loop -----
//        while (num1 > 10 && num2 > 10) {
//            int remDigit1 = num1 % 10;
//            int remDigit2 = num2 % 10;
//
//            if (remDigit1 == remDigit2) {
//                return true;
//            }
//        }
        return firstShared || secondShared;
    }
}