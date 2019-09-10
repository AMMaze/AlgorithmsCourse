package Lesson_8;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HashTable{
    private List<Item>[] hashArr;
    private int arrSize;
    private Item nonItem;

    @SuppressWarnings("unchecked")
    public HashTable(int size){
        this.arrSize = size;
        hashArr = (LinkedList<Item>[]) Array.newInstance(LinkedList.class, arrSize);
        nonItem = new Item(-1);
    }

    public void display(){
        for(int i=0;i<arrSize;i++){
            if(hashArr[i] !=null){
                for (Item item : hashArr[i]) {
                    System.out.print(item.getKey() + "  ");
                }
                System.out.println();
            } else {
                System.out.println("***");
            }
        }
    }

    public int hashFunc(int key){
        return key % arrSize;
    }

    public void insert(Item item){
        int key = item.getKey();
        int hashVal = hashFunc(key);
//        while (hashArr[hashVal] != null && hashArr[hashVal].get(0).getKey() != -1) {
//            ++hashVal;
//            hashVal%=arrSize;
//        }

        if (hashArr[hashVal] == null) {
            hashArr[hashVal] = new LinkedList<Item>();
        } else if (hashArr[hashVal].get(0).getKey() == -1) {
            hashArr[hashVal].clear();
        }
        hashArr[hashVal].add(item);
    }

    public Item delete(int key){
        int hashVal = hashFunc(key);
        if (hashArr[hashVal] != null) {
            Iterator<Item> itemIterator = hashArr[hashVal].iterator();
            while (itemIterator.hasNext()) {
                Item item = itemIterator.next();
                if (item.getKey() == key) {
//                    Item temp = hashArr[hashVal].get(0);
                    hashArr[hashVal].remove(item);
                    if (hashArr[hashVal].size() == 0)
                        hashArr[hashVal].add(nonItem);
                    return item;
                }
            }
//            ++hashVal;
//            hashVal%=arrSize;
        }
        return null;
    }

    public Item find(int key){
        int hashVal = hashFunc(key);
        if (hashArr[hashVal] != null) {
            for (Item item : hashArr[hashVal]) {
                if (item.getKey() == key) {
                    return item;
                }
            }
//            ++hashVal;
//            hashVal%=arrSize;
        }
        return null;
    }
}

