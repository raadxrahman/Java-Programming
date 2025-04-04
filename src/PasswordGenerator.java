//Task10

import java.util.Random;

public class PasswordGenerator {

    public static String generateRandomPassword(int len) {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&^*(){}[]/";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);

        // Ensure at least one of each required character type
        sb.append("0123456789".charAt(rnd.nextInt("0123456789".length()))); // digit
        sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(rnd.nextInt("ABCDEFGHIJKLMNOPQRSTUVWXYZ".length()))); // capital letter
        sb.append("abcdefghijklmnopqrstuvwxyz".charAt(rnd.nextInt("abcdefghijklmnopqrstuvwxyz".length()))); // small letter
        sb.append("!@#$%&".charAt(rnd.nextInt("!@#$%&^*(){}[]/".length()))); // special character

        for (int i = 4; i < len; i++) { // Fill the rest of the password
            System.out.println(sb.append(chars.charAt(rnd.nextInt(chars.length()))));
        }

        // Shuffle
        String password = sb.toString();
        return shuffleString(password);
    }

    public static String shuffleString(String str) {
        char[] chars = str.toCharArray();
        Random rnd = new Random();
        for (int i = chars.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            char temp = chars[index];
            chars[index] = chars[i];
            chars[i] = temp;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String password = generateRandomPassword(8);
        System.out.println("Generated Password: " + password);
    }
}