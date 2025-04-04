//Task09

import java.util.Scanner;

public class CheckBinary {

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
