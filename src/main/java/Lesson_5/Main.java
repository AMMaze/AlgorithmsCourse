package Lesson_5;

import Lesson_3.stack.Stack;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Item[] items = new Item[5];
        items[0] = new Item("Книга", 1, 600);
        items[1] = new Item("Бинокль", 2, 5000);
        items[2] = new Item("Аптечка", 4, 1500);
        items[3] = new Item("Ноутбук", 2, 40000);
        items[4] = new Item("Котелок", 1, 500);
        Pair<Integer, List<Item>> result = bagOfItems(5, 0, 0, items);
        System.out.println(result.first);
        for (Item it : result.second)
            System.out.println(it.name + " " + it.weight + " " + it.cost);
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

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Item))
                return false;
            Item item = (Item) obj;
            return item.name.equals(name) && item.weight == weight && item.cost == cost;
        }
    }

    static class Pair<T, E> {
        public T first;
        public E second;

        public Pair(T first, E second) {
            this.first = first;
            this.second = second;
        }
    }

    public static Pair<Integer, List<Item>> bagOfItems (int bagCapacity, int cost, int idx, Item... items) {
        int maxCost = cost;
        List<Item> placedItems = new LinkedList<>();
        for (int i = idx; i < items.length; i++) {
            int newCapacity = bagCapacity - items[i].weight;
            if (newCapacity < 0)
                continue;
            Pair<Integer, List<Item>> newValues = bagOfItems(newCapacity, cost + items[i].cost, i+1, items);
            if (newValues.first > maxCost) {
                maxCost = newValues.first;
                placedItems = newValues.second;
                placedItems.add(items[i]);
            }
        }
        return new Pair<>(maxCost, placedItems);
    }

}
