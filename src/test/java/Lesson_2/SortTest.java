package Lesson_2;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {

    private int[] ascendingOrder = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int[] descendingOrder = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};


    @Test
    public void sortedBubbleTest () {
        MyIntArray intArray = new MyIntArray(ascendingOrder);
        intArray.sortBubble(true);
        Assert.assertArrayEquals(ascendingOrder, intArray.getArray());
    }

    @Test
    public void sortedInsertionTest () {
        MyIntArray intArray = new MyIntArray(ascendingOrder);
        intArray.sortInsertion(true);
        Assert.assertArrayEquals(ascendingOrder, intArray.getArray());
    }

    @Test
    public void sortedSelectionTest () {
        MyIntArray intArray = new MyIntArray(ascendingOrder);
        intArray.selectionSort(true);
        Assert.assertArrayEquals(ascendingOrder, intArray.getArray());
    }

    @Test
    public void sortedQuickIterativeTest () {
        MyIntArray intArray = new MyIntArray(ascendingOrder);
        intArray.quickSortIterative(true);
        Assert.assertArrayEquals(ascendingOrder, intArray.getArray());
    }

    @Test
    public void sortedQuickRecursiveTest () {
        MyIntArray intArray = new MyIntArray(ascendingOrder);
        intArray.quickSortRecursive(true);
        Assert.assertArrayEquals(ascendingOrder, intArray.getArray());
    }


    @Test
    public void reversedBubbleTest () {
        MyIntArray intArray = new MyIntArray(descendingOrder);
        intArray.sortBubble(true);
        Assert.assertArrayEquals(ascendingOrder, intArray.getArray());
    }

    @Test
    public void reversedInsertionTest () {
        MyIntArray intArray = new MyIntArray(descendingOrder);
        intArray.sortInsertion(true);
        Assert.assertArrayEquals(ascendingOrder, intArray.getArray());
    }

    @Test
    public void reversedSelectionTest () {
        MyIntArray intArray = new MyIntArray(descendingOrder);
        intArray.selectionSort(true);
        Assert.assertArrayEquals(ascendingOrder, intArray.getArray());
    }

    @Test
    public void reversedQuickIterativeTest () {
        MyIntArray intArray = new MyIntArray(descendingOrder);
        intArray.quickSortIterative(true);
        Assert.assertArrayEquals(ascendingOrder, intArray.getArray());
    }

    @Test
    public void reversedQuickRecursiveTest () {
        MyIntArray intArray = new MyIntArray(descendingOrder);
        intArray.quickSortRecursive(true);
        Assert.assertArrayEquals(ascendingOrder, intArray.getArray());
    }


}
