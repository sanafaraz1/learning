package tree;

public class MyBinaryTree {
    private Node root;

    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "value=" + value + ", left=" + String.valueOf(left) + ", right=" + String.valueOf(right);
        }
    }

    public void insert(int value) {
        Node newNode = new Node(value, null, null);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        while (current != null) {
            if (value > current.value) {
                if (current.right == null) {
                    current.right = newNode;
                    return;
                }
                current = current.right;
            } else {
                if (current.left == null) {
                    current.left = newNode;
                    return;
                }
                current = current.left;
            }
        }
    }

    public Node lookup(int value) {
        if (root.value == value) {
            return root;
        }
        Node current = root;
        while (current != null) {
            if (current.value < value) {
                current = current.right;
            } else if (current.value > value) {
                current = current.left;
            } else if (current.value == value) {
                return current;
            }
        }
        return null;

    }

    public void traversal() {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println(current.value);

    }

    public static void main(String args[]) {
        MyBinaryTree binaryTree = new MyBinaryTree();
        binaryTree.insert(9);
        binaryTree.insert(4);
        binaryTree.insert(20);
        binaryTree.insert(1);
        binaryTree.insert(6);
        binaryTree.insert(15);
        binaryTree.insert(170);
        System.out.println(binaryTree.lookup(9).toString());
        System.out.println(binaryTree.lookup(6).toString());
        System.out.println(binaryTree.lookup(20).toString());
        binaryTree.traversal();
    }
}
