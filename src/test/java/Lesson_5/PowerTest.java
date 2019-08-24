package Lesson_5;

import org.junit.Assert;
import org.junit.Test;

public class PowerTest {

    @Test
    public void test1 () {
        Assert.assertEquals(9, Main.pow(3, 2));
    }

    @Test
    public void test2 () {
        Assert.assertEquals(64, Main.pow(2, 6));
    }

    @Test
    public void test3 () {
        Assert.assertEquals(1, Main.pow(4, 0));
    }
}
