package Lesson_6;

public class Main {
    public static void main (String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(50);
        tree.add(25);
        tree.add(75);
        tree.add(65);
        tree.add(10);
        tree.add(80);
        tree.remove(75);
        tree.print();
    }
}
