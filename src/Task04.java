//random array+minmax

import java.util.Random;
import java.util.Arrays;

public class Task04 {

    private void minMax(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Min: " + min + " Max: " + max);

    }


    public static void main(String[] args) {
        int[] array;
        Random rand = new Random();
        array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(99);
        }
        System.out.println("Random Generated Array: " + Arrays.toString(array));

        Task04 task04 = new Task04();
        task04.minMax(array);

    }


}
