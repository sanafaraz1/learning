package hashtables;

import java.util.HashSet;
import java.util.Set;

public class FirstRecurring {
    
    public int getFirstRecurringNumber(int[] input) {
        Set<Integer> set= new HashSet();
        for(int i=0;i<input.length;i++) {
            if(set.contains(input[i])) {
                return input[i];
            }
            set.add(input[i]);
        }
        return 0;
        
    }
    public static void main(String args[]) {
       FirstRecurring recurring = new FirstRecurring();
       int[] input= {2,1,1,2,3,5,1,2,4};
       System.out.println(recurring.getFirstRecurringNumber(input));
    }

}
