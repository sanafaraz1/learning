package queue;

import java.util.Stack;

public class QueueUsingInbuiltStackBetter {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    Integer front;

    public void push(int value) {
        if (stack1.isEmpty()) {
            front = value;
        }
        stack1.push(value);
    }

    public Integer pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        Integer popped = (Integer) stack2.pop();
        if(!stack2.isEmpty()) {
            front = (Integer) stack2.peek();
        }else {
            front = null;  
        }
        return popped;

    }

    public Integer peek() {
        return front;
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
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
        queue.push("Hello");
        System.out.println("Peeped " + queue.peek());
    }
}
