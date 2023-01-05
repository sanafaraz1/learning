package linkedlist;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private Node tail;
    int length = 0;

    public class Node {
        int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public void prepand(int value) {
        if (head == null) {
            head = new Node(value, null);
            tail = head;
        } else {
            Node newNode = new Node(value, head);
            head = newNode;
        }
        length++;
    }

    public void append(int value) {
        if (tail == null) {
            tail = new Node(value, null);
            if (head == null) {
                head = tail;
            }
        } else {
            Node newNode = new Node(value, null);
            tail.setNext(newNode);
            tail = newNode;
        }
        length++;
    }

    public void printList() {
        if (length == 0)
            return;
        System.out.print(head.getValue());
        Node tempNode = head;
        while (tempNode.getNext() != null) {
            tempNode = tempNode.next;
            System.out.print("-->" + tempNode.getValue());
        }
        System.out.println();
    }

    public void insert(int index, int value) {
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        Node newNode = new Node(value, prev.next);
        prev.next = newNode;
        length++;
    }

    public void remove(int index) {
        Node prev = head;
        if (index == 0) {
            head = prev.next;
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        Node after = prev.next;
        prev.next = after.next;
        if (index+1 == length) {
            tail = prev;
        }
        length--;

    }
    
    public void reverse() {
        int[] reversedArray=new int[length];
        Node prev= head;
        while (prev.next != null) {
            reversedArray[length - 1] = prev.value;
            length--;
            prev = prev.next;
        }
        reversedArray[0]=tail.value;
        System.out.println(Arrays.toString(reversedArray));
        //Another way 2-->5-->3-->8 change to 2<--5<--3<--8
        Node first= head;
        Node second= first.next;
        while(second.next!=null) {
            Node temp= second.next;
            second.next = first;
            first= second;
            second = temp;
        }
        tail= head;
        tail.next=null;
        head= second;
        head.next= first;
        printList();
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
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
