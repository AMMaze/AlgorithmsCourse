package Lesson_8;

public class Item{
    private int data;

    public Item(int data){
        this.data = data;
    }

    public int getKey(){
        return this.data;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Item))
            return false;
        Item item = (Item) obj;
        return data == item.getKey();
    }
}
