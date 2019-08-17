package Lesson_3;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTests {
    @Test
    public void testOneChar() {
        String str = "a";
        Assert.assertEquals(str, ReverseString.reverse(str));
    }

    @Test
    public void testMultipleChars() {
        Assert.assertEquals("cba", ReverseString.reverse("abc"));
    }
}
