package queue;

public class MyQueueUsingLinkedList {
    private Node first;
    private Node last;
    private int length;

    public class Node {
        String value;
        Node next;

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void enqueue(String value) {
        Node newNode = new Node(value, null);
        if (first == null) {
            first = newNode;
            last = first;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public String dequeue() {
        if (first == null) {
            throw new RuntimeException("Nothing there");
        }
        String dequeued = first.value;
        first = first.next;
        length--;
        return dequeued;
    }

    public String peek() {
        return first.value;
    }

    public static void main(String args[]) {
        MyQueueUsingLinkedList queue = new MyQueueUsingLinkedList();
        queue.enqueue("Google");
        queue.enqueue("Udemy");
        queue.enqueue("Discord");
        System.out.println("Popped " + queue.dequeue());
        System.out.println("Peeped " + queue.peek());
        System.out.println("Popped " + queue.dequeue());
        System.out.println("Peeped " + queue.peek());
        System.out.println("Popped " + queue.dequeue());
        System.out.println("Peeped " + queue.peek());
    }

}
