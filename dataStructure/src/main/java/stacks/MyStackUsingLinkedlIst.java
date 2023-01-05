package stacks;

public class MyStackUsingLinkedlIst {
    private Node top;
    private Node bottom;
    private int length;

    public class Node {
        String value;
        Node next;

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void push(String value) {
        if (top == null) {
            top = new Node(value, null);
            bottom = top;
        } else {
            Node temp = top;
            top = new Node(value, temp);
        }
        length++;
    }

    public String pop() {
        if (top == null) {
            throw new RuntimeException("Nothing there");
        } else {
            String popped = top.value;
            top = top.next;
            length--;
            return popped;
        }
    }

    public String peek() {
        return top.value;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public static void main(String args[]) {
        MyStackUsingLinkedlIst list = new MyStackUsingLinkedlIst();
        list.push("Google");
        list.push("Udemy");
        list.push("Discord");
        System.out.println("Popped "+list.pop());
        System.out.println("Peeped "+list.peek());
        System.out.println("Popped "+list.pop());
        System.out.println("Peeped "+list.peek());
        System.out.println("Popped "+list.pop());
        System.out.println("Peeped "+list.peek());
    }

}
