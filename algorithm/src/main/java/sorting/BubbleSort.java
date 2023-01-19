package sorting;

import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(input));
    }

    public static void main(String args[]) {
        int[] a = { 3, 1, 6, 83, 91, 31, 13, 55, 81 };
        BubbleSort sort = new BubbleSort();
        sort.sort(a);
    }

}
