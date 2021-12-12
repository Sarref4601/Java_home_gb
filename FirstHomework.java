/**
*   Java 1. Homework #1
*
*   @author Andrei Boiko
*   @version 10/12/2021
*/
class FirstHomework {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        
    }
        static void printThreeWords() {
            System.out.println("1)----------");
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
        
        static void checkSumSign() {
            int a = 11;
            int b = -10;
            
                System.out.println("2)----------");
                System.out.println("Sum is " +(a + b >= 0? "positive" : "negative"));
        }
        
        static void printColor() {
            int value = 101;
                System.out.println("3)----------");
            if (value <= 0) {
                System.out.println("Color is Red");
            }
            else if (value <= 100) {
                System.out.println("Color is Yellow");
            }
            else {
                System.out.println("Color is Green");
            }
        }
        static void compareNumbers() {
            int a = 1;
            int b = 2;
                System.out.println("4)----------");
                System.out.println("Result is " +(a >= b? "a >= b" : "a < b"));
        }
            
}