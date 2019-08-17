package Lesson_3;

import Lesson_3.queue.Queue;
import Lesson_3.queue.QueueImpl;
import org.junit.Assert;
import org.junit.Test;

public class QueueTest {

    @Test
    public void testAddRemove() {
        Queue<Integer> queue = new QueueImpl<>(1);
        queue.insert(1);
        Assert.assertEquals(1, (int) queue.remove());
    }

    @Test
    public void test2AddRemove() {
        Queue<Integer> queue = new QueueImpl<>(1);
        queue.insert(1);
        queue.insert(2);
        Assert.assertEquals(1, (int) queue.remove());
    }

    @Test
    public void test2AddPeek() {
        Queue<Integer> queue = new QueueImpl<>(1);
        queue.insert(1);
        queue.insert(2);
        Assert.assertEquals(1, (int) queue.peek());
    }

    @Test
    public void test2AddPeekRemove() {
        Queue<Integer> queue = new QueueImpl<>(2);
        queue.insert(1);
        queue.insert(2);
        Assert.assertEquals(1, (int) queue.peek());
        Assert.assertEquals(1, (int) queue.remove());
        Assert.assertEquals(2, (int) queue.peek());
    }
}
