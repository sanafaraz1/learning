package sorting;

import java.util.Arrays;

public class SelectionSort {
    public void sort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int smallestPosition = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[smallestPosition] > input[j]) {
                    smallestPosition = j;
                }
            }
            if (smallestPosition != i) {
                int temp = input[i];
                input[i] = input[smallestPosition];
                input[smallestPosition] = temp;
            }
        }
        System.out.println(Arrays.toString(input));
    }

    public static void main(String args[]) {
        int[] a = { 3, 1, 6, 83, 91, 31, 13, 55, 81 };
        SelectionSort sort = new SelectionSort();
        sort.sort(a);
    }
}
