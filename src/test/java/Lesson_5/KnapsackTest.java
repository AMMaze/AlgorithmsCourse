package Lesson_5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class KnapsackTest {

    Main.Item[] items;

    @Before
    public void init() {
        items = new Main.Item[5];
        items[0] = new Main.Item("Книга", 1, 600);
        items[1] = new Main.Item("Бинокль", 2, 5000);
        items[2] = new Main.Item("Аптечка", 4, 1500);
        items[3] = new Main.Item("Ноутбук", 2, 40000);
        items[4] = new Main.Item("Котелок", 1, 500);
    }

    @Test
    public void allItems1() {
        Main.Pair<Integer, List<Main.Item>> result = Main.bagOfItems(10, 0, 0, items);
        Assert.assertEquals(47600, (int) result.first);
        Assert.assertTrue(result.second.containsAll(Arrays.asList(items)));
    }

    @Test
    public void allItems2() {
        Main.Pair<Integer, List<Main.Item>> result = Main.bagOfItems(15, 0, 0, items);
        Assert.assertEquals(47600, (int) result.first);
        Assert.assertTrue(result.second.containsAll(Arrays.asList(items)));
    }

    @Test
    public void oneItem1() {
        Main.Pair<Integer, List<Main.Item>> result = Main.bagOfItems(1, 0, 0, items);
        Assert.assertEquals(600, (int) result.first);
        Assert.assertTrue(result.second.size() == 1 && result.second.contains(items[0]));
    }

    @Test
    public void oneItem2() {
        Main.Pair<Integer, List<Main.Item>> result = Main.bagOfItems(2, 0, 0, items);
        Assert.assertEquals(40000, (int) result.first);
        Assert.assertTrue(result.second.size() == 1 && result.second.contains(items[3]));
    }

    @Test
    public void twoItems1() {
        Main.Pair<Integer, List<Main.Item>> result = Main.bagOfItems(3, 0, 0, items);
        Assert.assertEquals(40600, (int) result.first);
        Assert.assertTrue(result.second.size() == 2 && result.second.contains(items[3]) && result.second.contains(items[0]));
    }

}
