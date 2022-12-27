package array;

public class StringRever {
    public String reverseString(String input) {
        int length = input.length()-1;
        char[] reverString = new char[length+1];
        int i = 0;
        while (length >= 0) {
            reverString[i] = input.charAt(length);
            length--;
            i++;
        }

        return new String(reverString);
    }
    
    public String reverseWithBuilder(String input) {
        StringBuilder reverseString= new StringBuilder(input);
        reverseString = reverseString.reverse();
        return reverseString.toString();
    }
    
    public String oneLine(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    

    public static void main(String args[]) {
        StringRever str = new StringRever();
        System.out.println(str.reverseString("Hello"));
        System.out.println(str.reverseWithBuilder("Hello"));
        System.out.println(str.oneLine("Hello"));
    }

}
