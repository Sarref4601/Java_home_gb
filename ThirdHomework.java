import java.util.Arrays;
/**
 *   Java 1. Homework #3
 *
 *   @author Andrei Boiko
 *   @version 18/12/2021
 */
 
class ThirdHomework {
    public static void main(String[]args) {
        reverse0To1();
        increase0To100();
        checkArrayLower6();
        useDiagonal();
        System.out.println(Arrays.toString(isReturnArray(10, 13)));
    }
    static void reverse0To1() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    static void increase0To100() {
        int[] arr = new int[100];
            arr[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
    }
    static void checkArrayLower6() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            } else {
                arr[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void useDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i] = 0;
            }
        }
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length; j++) {
                        if (i > j || i < j) {
                            System.out.print(arr[i][j] + " ");
                        } else {
                            System.out.print("1 ");
                        }
                    }
                    System.out.println();
                }
    }
    static int[] isReturnArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}