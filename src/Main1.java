import java.util.Random;
import java.util.Scanner;

public class Main1 {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double d = sc.nextDouble();
//        double x = Math.random();
//        System.out.println("D: " + d);
//        System.out.println("X: " + x);
//        System.out.println((int)(x+d));
//    }
    public static void main(String[] args) {


        for (int i = 1; i <= 9; i++) {
            int x = 1;
            if (i <= 5) { // Decreasing part: First 5 lines
                for (int j = 1; j <= 6 - i; j++) {
                    System.out.print(x);
                    x++;
                }
            } else { // Increasing part: Last 4 lines
                for (int j = 1; j <= i - 4; j++) {
                    System.out.print(x);
                    x++;
                }
            }
            System.out.println();
        }

//        for (int i = 5; i >= 1; i--) { // Start from 5 and decrease to 1
//            int x = 1;
//            for (int j = 1; j <= i; j++) { // Print only up to the current value of i
//                System.out.print(x);
//                x++;
//            }
//            System.out.println();
//        }
//
//
//        for (int i = 1; i <= 5; i++) {
//            int x = 1;
//            for (int j = 1; j <= i; j++) {
//                System.out.print(x);
//                x++;
//            }
//            System.out.println();
//        }
    }
}


