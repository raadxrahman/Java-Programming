//input is binary or not

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: "); // 1001
        String inputString = sc.nextLine();

        boolean isBinary = true;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch != '0' && ch != '1') {
                isBinary = false;
                break;
            }
        }

        System.out.println(isBinary); //true
    }
}
