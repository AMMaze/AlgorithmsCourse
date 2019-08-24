package Lesson_5;

public class Main {

    public static void main(String[] args) {
        Item[] items = new Item[5];
        items[0] = new Item("Книга", 1, 600);
        items[1] = new Item("Бинокль", 2, 5000);
        items[2] = new Item("Аптечка", 4, 1500);
        items[3] = new Item("Ноутбук", 2, 40000);
        items[4] = new Item("Котелок", 1, 500);
        System.out.println(bagOfItems(3, 0, 0, items));
    }

    static int pow (int base, int power) {
        if (power == 0)
            return 1;
        return base * pow(base, power - 1);
    }

    static class Item {
        public Item(String name, int weight, int cost) {
            this.name = name;
            this.weight = weight;
            this.cost = cost;
        }

        public String name;
        public int weight, cost;
    }

    public static int bagOfItems (int bagCapacity, int cost, int idx, Item... items) {
        int maxCost = cost;
        for (int i = idx; i < items.length; i++) {
            int newCapacity = bagCapacity - items[i].weight;
            int newCost = newCapacity >= 0 ? bagOfItems(newCapacity, cost + items[i].cost, i+1, items) : 0;
            maxCost = Math.max(newCost, maxCost);
        }
        return maxCost;
    }

}
