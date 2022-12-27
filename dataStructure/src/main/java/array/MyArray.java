package array;

import java.util.Arrays;

public class MyArray {
    Object[] myArray = new Object[1];
    int maxLength = 1;
    int actualLength = 0;

    public Object get(int index) {
        if (index > actualLength) {
            return "Error!";
        }
        return myArray[index];
    }

    public void pushOrAppend(int value) {
        if (actualLength == maxLength) {
            maxLength = maxLength * 2;
            myArray = Arrays.copyOf(myArray, maxLength);

        }
        myArray[actualLength] = value;
        actualLength++;
    }

    public Object pop() {
        Object deleted = myArray[actualLength - 1];
        myArray[actualLength - 1] = null;
        actualLength--;
        return deleted;
    }

    public Object deleteAt(int index) {
        Object deleted = myArray[index];
        for (int i = index; i < myArray.length; i++) {
            myArray[index] = myArray[index + 1];
        }
        myArray[myArray.length - 1] = null;
        actualLength--;
        return deleted;
    }

    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }

    public static void main(String args[]) {
        MyArray testArray = new MyArray();
        testArray.pushOrAppend(1);
        System.out.println(testArray.toString());
        testArray.pushOrAppend(2);
        System.out.println(testArray.toString());
        testArray.pop();
        System.out.println(testArray.toString());
        testArray.pushOrAppend(2);
        testArray.pushOrAppend(3);
        testArray.pushOrAppend(4);
        testArray.pushOrAppend(5);
        System.out.println(testArray.toString());
        testArray.get(1);
        System.out.println(testArray.toString());
    }
}
