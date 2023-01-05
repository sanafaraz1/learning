package linkedlist;

public class MyDoublyLinkedList {
    private Node head;
    private Node tail;
    int length = 0;

    public class Node {
        int value;
        private Node next;
        private Node previous;

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.previous = prev;
        }
    }

    public void prepand(int value) {
        if (head == null) {
            head = new Node(value, null, null);
            tail = head;
        } else {
            Node newNode = new Node(value, head, null);
            head.previous = newNode;
            head = newNode;
        }
        length++;
    }

    public void append(int value) {
        if (tail == null) {
            tail = new Node(value, null, null);
            head = tail;
        } else {
            Node newNode = new Node(value, null, tail);
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void printList() {
        if (length == 0)
            return;
        System.out.print(head.value);
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
            System.out.print("-->" + tempNode.value);
        }
        System.out.println();
    }

    public void insert(int index, int value) {
        if (index == 0) {
            prepand(value);
        }
        if (index == length - 1) {
            append(value);
        }
        if (index < length / 2) {
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            Node nextNode = currentNode.next;
            Node newNode = new Node(value, nextNode, currentNode);
            currentNode.next = newNode;
            nextNode.previous = newNode;

        } else {
            Node currentNode = tail;
            for (int i = length - 1; i > index; i--) {
                currentNode = currentNode.previous;
            }
            Node previous = currentNode.previous;
            Node newNode = new Node(value, currentNode, previous);
            previous.next = newNode;
            currentNode.previous = newNode;
        }
        length++;
    }

    public void remove(int index) {
        Node prev = head;
        if (index == 0) {
            head = prev.next;
            head.previous = null;
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        Node deleteNode = prev.next;       
        if (index == length - 1) {
            tail = prev;
            tail.next = null;
        } else {
            Node nextNode = deleteNode.next;
            prev.next = nextNode;
            nextNode.previous = prev;
        }
        length--;

    }

    public void reverse() {
        Node current = tail;
        while (current.previous != null) {
            System.out.print(current.value + "-->");
            current = current.previous;
        }
        System.out.println(head.value);
    }

    public static void main(String[] args) {
        MyDoublyLinkedList list = new MyDoublyLinkedList();
        list.append(1);
        list.prepand(2);
        list.append(3);
        list.append(4);
        list.printList();
        list.insert(2, 5);
        list.printList();
        list.remove(1);
        list.printList();
        list.remove(3);
        list.printList();
        list.append(8);
        list.printList();
        list.reverse();
    }

}
