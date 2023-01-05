package stacks;

import java.util.ArrayList;
import java.util.List;

public class MyStackUsingArray {
    String[] stack = new String[50]; // Can resize if size is exceeded
    List<String> stackAsList = new ArrayList();
    int length = 0;

    public void push(String value) {
        stack[length] = value;
        length++;
    }

    public void pushinList(String value) {
        stackAsList.add(value);
    }

    public String pop() {
        String popped = stack[length - 1];
        length--;
        return popped;
    }

    public String popFromList() {
        return stackAsList.remove(stackAsList.size() - 1);
    }

    public String peek() {
        return stack[length - 1];
    }

    public String peepFromList() {
        return stackAsList.get(stackAsList.size() - 1);
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public static void main(String args[]) {
        MyStackUsingArray list = new MyStackUsingArray();
        list.push("Google");
        list.push("Udemy");
        list.push("Discord");
        System.out.println("Popped " + list.pop());
        System.out.println("Peeped " + list.peek());
        System.out.println("Popped " + list.pop());
        System.out.println("Peeped " + list.peek());
        System.out.println("Popped " + list.pop());
//      System.out.println("Peeped " + list.peek());
        list.pushinList("Google");
        list.pushinList("Udemy");
        list.pushinList("Discord");
        System.out.println("Popped " + list.popFromList());
        System.out.println("Peeped " + list.peepFromList());
        System.out.println("Popped " + list.popFromList());
        System.out.println("Peeped " + list.peepFromList());
        System.out.println("Popped " + list.popFromList());

    }

}
