//binary search

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Arrays.sort(cgpa);
        System.out.print("Enter the CGPA to search: ");
        double searchCGPA = sc.nextDouble();

        int index = binarySearch(cgpa, searchCGPA);

        if (index == -1)
            System.out.println("CGPA " + searchCGPA + " is not found in the array");
        else
            System.out.println("CGPA " + searchCGPA + " is found in the array");
    }

    public static int binarySearch(double[] arr, double target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }
}