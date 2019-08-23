package Lesson_3;

import Lesson_3.stack.Stack;
import Lesson_3.stack.StackImpl;
import org.junit.Assert;
import org.junit.Test;

public class StackTests {

    @Test
    public void testPushPop() {
        Stack<Integer> stack = new StackImpl<>(1);
        stack.push(1);
        Assert.assertEquals(1, (int) stack.pop());
    }

    @Test
    public void test2PushPop() {
        Stack<Integer> stack = new StackImpl<>(2);
        stack.push(1);
        stack.push(2);
        Assert.assertEquals(2, (int) stack.pop());
        Assert.assertEquals(1, (int) stack.pop());
    }

    @Test
    public void testPopNull() {
        Stack<Integer> stack = new StackImpl<>(2);
        Assert.assertNull(stack.pop());
    }
}
