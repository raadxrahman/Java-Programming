//two lowest from input

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[10];

        System.out.println("Enter the heights of 10 babies in cm:");
        for (int i = 0; i < 10; i++) {
            heights[i] = sc.nextInt();
        }

        int lowest1 = Integer.MAX_VALUE;
        int lowest2 = Integer.MAX_VALUE;

        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            if (height < lowest1) {
                lowest2 = lowest1;
                lowest1 = height;
            } else if (height < lowest2) {
                lowest2 = height;
            }
        }

        System.out.println("The two lowest heights are: " + lowest1 + " cm and " + lowest2 + " cm");
    }
}