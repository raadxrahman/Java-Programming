//find words, characters, vowels, consonants

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: "); //example input: I am a sqa engineer
        String input = sc.nextLine();
        int wordCount = 0;
        int charCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        // Count words
        if (input == null || input.isEmpty()) {
            System.out.println("Empty input");
        } else {
            String[] words = input.split("\\s+"); // Split words by spaces
            wordCount = words.length;
        }

        // Count characters and vowels+consonants
        input = input.replaceAll("\\s+", ""); // Remove all spaces
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                charCount++;
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Words: " + wordCount); //Words: 5
        System.out.println("Chars: " + charCount); //Chars: 15
        System.out.println("Vowel: " + vowelCount); //Vowel: 8
        System.out.println("Consonant: " + consonantCount); //Consonant: 7
    }
}