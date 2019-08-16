package Lesson_2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    private static int ELEMENTS_NUMBER = 100000;


    public static void main(String[] args) {
        MyIntArray arr = new MyIntArray(ELEMENTS_NUMBER);
        arr.fill(100000);
        arr.print();
        arr.backupState();

        try {
            System.out.println("Bubble sort : " + ELEMENTS_NUMBER + " elements : " +
                    clockInvoke(arr, "sortBubble", true) + "ms");
            arr.restoreState();
            System.out.println("Insertion sort : " + ELEMENTS_NUMBER + " elements : " +
                    clockInvoke(arr, "sortInsertion", true) + "ms");
            arr.restoreState();
            System.out.println("Selection sort : " + ELEMENTS_NUMBER + " elements : " +
                    clockInvoke(arr, "selectionSort", true) + "ms");
            arr.restoreState();
            System.out.println("Quick sort (iterative): " + ELEMENTS_NUMBER + " elements : " +
                    clockInvoke(arr, "quickSortIterative", true) + "ms");
            arr.print();
            arr.restoreState();
//            System.out.println("Quick sort (recursive): " + ELEMENTS_NUMBER + " elements : " +
//                    clockInvoke(arr, "quickSortRecursive", true) + "ms");
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static long clockInvoke (MyIntArray intArray, String method, boolean ascendingOrder) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Method sortMethod = intArray.getClass().getMethod(method, boolean.class);
        long curTime = System.currentTimeMillis();
        sortMethod.invoke(intArray, ascendingOrder);
        return System.currentTimeMillis() - curTime;
    }

}
