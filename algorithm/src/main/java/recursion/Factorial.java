package recursion;

public class Factorial {
    
    public int factorialUsingRecursion(int number) {
        if(number==2) {
            return 2;
        }
        return number * factorialUsingRecursion(number-1);
    }
    
    public int factorialUsingIteration(int number) {
        int fact=1;
        for(int i=2;i<=number;i++) {
            fact= fact*i;
        }
        return fact;
    }
    

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorialUsingIteration(5));
        System.out.println(factorial.factorialUsingRecursion(5));

    }

}
