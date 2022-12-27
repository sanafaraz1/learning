package array;

import java.util.Arrays;

public class MergeSortedArray {
    public int[] mergedArray(int[] a1, int a2[]) {
        int lowA1 = 0;
        int lowA2 = 0;
        int i = 0;
        int[] mergedArray = new int[a1.length + a2.length];
        while (lowA1 < a1.length && lowA2 < a2.length) {
            if (a1[lowA1] > a2[lowA2]) {
                mergedArray[i] = a2[lowA2];
                lowA2++;
            } else {
                mergedArray[i] = a1[lowA1];
                lowA1++;
            }
            i++;
        }
        while (lowA1 < a1.length) {
            mergedArray[i] = a1[lowA1];
            lowA1++;
        }
        while (lowA2 < a2.length) {
            mergedArray[i] = a2[lowA2];
            lowA2++;
        }
        return mergedArray;
    }

    public static void main(String args[]) {
        MergeSortedArray array = new MergeSortedArray();
        int[] a1 = { 0, 3, 4, 31 };
        int[] a2 = { 4, 6, 30 };
        System.out.println(Arrays.toString(array.mergedArray(a1, a2)));

    }
}
