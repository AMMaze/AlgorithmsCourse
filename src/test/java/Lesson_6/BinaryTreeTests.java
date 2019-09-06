package Lesson_6;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTests {

    @Test
    public void nullTree() {
        BinaryTree tree = new BinaryTree();
        Assert.assertNull(tree.find(1));
    }

    @Test
    public void oneAdd() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        Assert.assertEquals(1, tree.find(1).getValue());
    }

    @Test
    public void twoAdd() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        Assert.assertEquals(1, tree.find(1).getValue());
    }

    @Test
    public void removeLeaf() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.remove(2);
        Assert.assertNull(tree.find(2));
    }

    @Test
    public void removeRoot() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.remove(1);
        Assert.assertNull(tree.find(1));
    }
}
