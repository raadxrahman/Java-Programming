//Task06

public class PatternedOutput {
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
    }
}
