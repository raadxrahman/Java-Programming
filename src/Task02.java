// sort

public class Task02 {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        for (int i = 0; i < cgpa.length - 1; i++) {
            for (int j = 0; j < cgpa.length - i - 1; j++) {
                if (cgpa[j] < cgpa[j + 1]) {
                    double temp = cgpa[j];
                    cgpa[j] = cgpa[j + 1];
                    cgpa[j + 1] = temp;
                }
            }
        }

        System.out.print("CGPA: " + cgpa[0]);
        for (int x = 1; x < cgpa.length; x++) {
            System.out.print(", " + cgpa[x]);
        }
    }
}
