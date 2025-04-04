//banknotes

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        System.out.println("Output:");

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                int count = amount / notes[i];
                amount %= notes[i];
                System.out.println(notes[i] + " " + count);
            }
        }
        sc.close();
    }
}