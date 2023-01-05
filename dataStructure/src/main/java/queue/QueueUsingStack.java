package queue;

import java.util.Stack;

import stacks.MyStackUsingLinkedlIst;

public class QueueUsingStack {
    MyStackUsingLinkedlIst stack1 = new MyStackUsingLinkedlIst();
    MyStackUsingLinkedlIst stack2 = new MyStackUsingLinkedlIst();
    Stack stack3 = new Stack<Integer>();

    public void push(String value) {
        stack1.push(value);
    }

    public String pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        String popped = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return popped;

    }

    public String peek() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        String peeped = stack2.peek();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return peeped;
    }

    public boolean empty() {
        
        return stack1.isEmpty();
    }

    public static void main(String args[]) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.push("Google");
        queue.push("Udemy");
        queue.push("Discord");
        System.out.println("Popped " + queue.pop());
        System.out.println("Peeped " + queue.peek());
        System.out.println("Popped " + queue.pop());
        System.out.println("Peeped " + queue.peek());
        System.out.println("Popped " + queue.pop());
        System.out.println("Peeped " + queue.peek());
    }
}
