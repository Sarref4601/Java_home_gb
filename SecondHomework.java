/**
 *   Java 1. Homework #2
 *
 *   @author Andrei Boiko
 *   @version 13/12/2021
 */
class SecondHomework {
    public static void main(String[]args) {
        
        System.out.println("1----------");
        System.out.println(checkSumm(5, 4));
        
        checkNum(5);
        
        System.out.println("3----------");
        System.out.println(checkNumReturnReverse(-1));
        
        printMyText("Hello Sergey!", 5);
    }

        static boolean checkSumm(int a, int b) {
            return (a + b) >= 10 && (a + b) <= 20;
        }

        static void checkNum(int a) {

            System.out.println("2----------");
            System.out.println("Num is " +(a >= 0? "positive" : "negative"));
        }
        
        static boolean checkNumReturnReverse(int a) {
            return a <= 0;
        }
        
        public static void printMyText(String text, int a) { 
                System.out.println("4----------");
            for (int i = 0; i < a; i++) {
            System.out.println(text);
            }
        }


}