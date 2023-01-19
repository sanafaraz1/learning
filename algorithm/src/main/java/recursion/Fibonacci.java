package recursion;

public class Fibonacci {

    public int getFibonacciByRecursion(int index) {
        if (index < 2) {
            return index;
        }
        return getFibonacciByRecursion(index - 1) + getFibonacciByRecursion(index - 2);
    }

    public int getFibonacciByIlteration(int index) {
        if (index < 2) {
            return index;
        }
        int finalNo=0;
        int value = 0;
        int prev = 1;
        for (int i = 0; i < index; i++) {
            finalNo = value + prev;
            prev = value;
            value= finalNo;
        }
        return finalNo;
    }

    public static void main(String[] args) {
        Fibonacci factorial = new Fibonacci();
        System.out.println(factorial.getFibonacciByRecursion(10));
        System.out.println(factorial.getFibonacciByIlteration(10));

    }
}
