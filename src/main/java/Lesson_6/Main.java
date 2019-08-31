package Lesson_6;

public class Main {
    public static void main (String[] args) {
        BinaryTree[] trees = new BinaryTree[20];
        int balanced = 0, amount = 20;
        for (int i = 0; i < amount; i++) {
            trees[i] = BinaryTree.createRandomTree(6, -100, 100);
            if (trees[i].isBalanced())
                balanced++;
        }
        System.out.println((balanced / amount) * 100  + "%");
    }
}
