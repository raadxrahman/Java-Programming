//find combination

public class Task15 {

    public static void calculateQuestions() {
        int totalQuestions = 15;
        int totalMarks = 100;

        for (int x = 0; x <= totalQuestions; x++) {  // x = 5-mark
            for (int y = 0; y <= totalQuestions; y++) {  // y = 10-mark
                if (x + y == totalQuestions && 5 * x + 10 * y == totalMarks) {
                    System.out.println("5 marks question is " + x);
                    System.out.println("10 marks question is " + y);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        calculateQuestions();
    }
}