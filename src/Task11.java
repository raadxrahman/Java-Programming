//string manipulation

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: "); //I am a SQA Engineer
        String input = sc.nextLine();
        String vowels = "AEIOUaeiou";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) == -1) {
                result += input.charAt(i);
            }
        }

        System.out.println(result); // m sq ngnr
    }
}