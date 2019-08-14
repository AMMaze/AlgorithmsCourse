package Lesson_2;

public class Main {
    private static long ELEMENTS_NUMBER = 1000000;


    public static void main(String[] args) {
        MyIntArray arr = new MyIntArray(10);
        arr.fill(100);
        arr.print();

        arr.remove(3);
        arr.print();

        arr.add(333);
        arr.print();

        arr.add(444);
        arr.print();

        arr.quickSort(false);
        arr.print();
    }

}
