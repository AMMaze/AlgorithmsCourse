package Lesson_3;

import Lesson_3.queue.PriorityQueue;
import Lesson_3.queue.Queue;
import org.junit.Assert;
import org.junit.Test;

public class PriorityQueueTests {

    @Test
    public void testAddRemove() {
        Queue<Integer> queue = new PriorityQueue<>(1);
        queue.insert(1);
        Assert.assertEquals(1, (int) queue.remove());
    }

    @Test
    public void test2AddRemove() {
        Queue<Integer> queue = new PriorityQueue<>(2);
        queue.insert(2);
        queue.insert(1);
        Assert.assertEquals(1, (int) queue.remove());
    }

    @Test
    public void test2AddPeek() {
        Queue<Integer> queue = new PriorityQueue<>(2);
        queue.insert(2);
        queue.insert(1);
        Assert.assertEquals(1, (int) queue.peek());
    }

    @Test
    public void test2AddPeekRemove() {
        Queue<Integer> queue = new PriorityQueue<>(2);
        queue.insert(2);
        queue.insert(1);
        Assert.assertEquals(1, (int) queue.peek());
        Assert.assertEquals(1, (int) queue.remove());
        Assert.assertEquals(2, (int) queue.peek());
    }

}
