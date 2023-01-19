package sorting;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InsertionSort {
    public void sort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < i; j++)
                if (input[i] < input[j]) {
                    int temp = input[i];
                    for (int k = i; k > j; k--) {
                        input[k] = input[k - 1];
                    }
                    input[j] = temp;
                    break;

                }
        }
        System.out.println(Arrays.toString(input));
    }

    public void sortUsingList(Integer[] input) {
        List<Integer> inputlist = new LinkedList<Integer>(Arrays.asList(input));
        for (int i = 1; i < inputlist.size(); i++) {
            for (int j = 0; j < i; j++)
                if (inputlist.get(i) < inputlist.get(j)) {
                    Integer value = inputlist.remove(i);
                    inputlist.add(j, value);
                    break;

                }
        }
        System.out.println(inputlist);
    }

    public static void main(String args[]) {
        int[] a = { 3, 1, 6, 83, 91, 31, 13, 55, 81 };
        InsertionSort sort = new InsertionSort();
        sort.sort(a);
        Integer[] b = { 3, 1, 6, 83, 91, 31, 13, 55, 81 };
        sort.sortUsingList(b);
    }

}
