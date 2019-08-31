package Lesson_6;

public class Main {
    public static void main (String[] args) {
        BinaryTree tree = BinaryTree.createRandomTree(6, -100, 100);
//        tree.add(50);
//        tree.add(25);
//        tree.add(75);
//        tree.add(65);
//        tree.add(10);
//        tree.add(80);
//        tree.remove(75);
        tree.print();
        System.out.println(tree.depth());
    }
}
