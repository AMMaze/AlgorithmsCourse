package Lesson_6;

import java.util.Stack;

public class BinaryTree {

    private class Node {
        private int value;
        private Node leftChild, rightChild;

        public void setValue(int value) {
            this.value = value;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        public int getValue() {
            return value;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public Node(int value) {
            this.value = value;
        }

        public void print() {
            System.out.print(value);
        }
    }

    private Node root;

    public void add (int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            Node parent = root;
            Node it = root;
            while (it != null) {
                parent = it;
                if (it.getValue() > value) {
                    it = it.getLeftChild();
                } else if (it.getValue() < value) {
                    it = it.getRightChild();
                } else {
                    return;
                }
            }
            if (parent.getValue() >= value) {
                parent.setLeftChild(new Node(value));
            } else {
                parent.setRightChild(new Node(value));
            }
        }
    }

    public void add (Node value) {
        if (value == null)
            return;
        if (root == null) {
            root = value;
        } else {
            Node parent = root;
            Node it = root;
            while (it != null) {
                parent = it;
                if (it.getValue() > value.getValue()) {
                    it = it.getLeftChild();
                } else if (it.getValue() < value.getValue()) {
                    it = it.getRightChild();
                } else {
                    return;
                }
            }
            if (parent.getValue() >= value.getValue()) {
                parent.setLeftChild(value);
            } else {
                parent.setRightChild(value);
            }
        }
    }

    public Node find (int key) {
        Node it = root;
        while (it != null) {
            if (it.value > key) {
                it = it.getLeftChild();
            } else if (it.value < key) {
                it = it.getRightChild();
            } else {
                return it;
            }
        }
        return null;
    }

    public boolean remove (int key) {
        Node it = root;
        Node parent = it;
        while (it != null) {
            if (it.value > key) {
                parent = it;
                it = it.getLeftChild();
            } else if (it.value < key) {
                parent = it;
                it = it.getRightChild();
            } else {
                break;
            }
        }
        if (it == null)
            return false;
        Node left = it.getLeftChild();
        Node right = it.getRightChild();

        if (parent.getValue() > key) {
            parent.setLeftChild(null);
        } else {
            parent.setRightChild(null);
        }
        this.add(left);
        this.add(right);
        return true;
    }

    public void print() {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;

        while (!isRowEmpty) {
            Stack<Node> localStack = new Stack<>();
            isRowEmpty = true;
            for(int i=0;i<nBlanks;i++){
                System.out.print(" ");
            }
            while (!stack.isEmpty()) {
                Node temp = stack.pop();
                if (temp != null){
                    temp.print();
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if(temp.leftChild != null || temp.rightChild != null){
                        isRowEmpty = false;
                    }
                }else{
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int j=0; j < nBlanks * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println(" ");
            nBlanks = nBlanks / 2;
            while (!localStack.isEmpty()) {
                stack.push(localStack.pop());
            }
            System.out.println("..........................................");
        }
    }

    public int depth() {
        return level(root);
    }

    public int level(Node node) {
        if (node == null)
            return 0;
        return Math.max(level(node.getLeftChild()), level(node.getRightChild())) + 1;
    }
}
