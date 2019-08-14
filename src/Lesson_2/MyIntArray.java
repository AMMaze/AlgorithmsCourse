package Lesson_2;

import java.util.Arrays;
import java.util.Random;

public class MyIntArray {
    private int[] array;
    private int size, length;

    public MyIntArray() {
        array = new int[0];
        size = 0;
        length = 0;
    }

    public MyIntArray(int size) {
        array = new int[size];
        this.size = size;
        length = 0;
    }

    public int getSize() {
        return size;
    }

    public int getLength() {
        return length;
    }

    public void add(int val) {
        if (length == size) {
            size *= 2;
            int[] tmp_arr = new int[size];
            System.arraycopy(array, 0, tmp_arr, 0, length);
            array = tmp_arr;
        }
        array[length++] = val;
    }

    public void remove(int idx) {
//        for (int i = idx + 1; i < length; i++) {
//            array[i - 1] = array[i];
//        }
        System.arraycopy(array, idx + 1, array, idx, length - idx - 1);
        length--;
    }

    public int find(int val) {
        for (int i = 0; i < length; i++) {
            if (array[i] == val)
                return i;
        }
        return -1;
    }

    public void fill(int maxValue) {
        Random r = new Random();
        for (int i = length; i < size; i++) {
            array[i] = r.nextInt(maxValue);
        }
        length = size;
    }

    public void print() {
        for (int i = 0; i < length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[length - 1]);
    }

    private void swapIdx(int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    public void sortBubble(boolean ascOrder) {
        for (int i = 0; i < length; i++) {
            boolean swap = false;
            for (int j = 1; j < length; j++) {
                if (ascOrder ? array[j-1] > array[j] : array[j-1] < array[j]) {
                    swapIdx(j-1, j);
                    swap = true;
                }
            }
            if (!swap)
                return;
        }
    }

    public void sortInsertion (boolean ascOrder) {
        for (int i = 1; i < length; i++) {
            int cur = array[i];
            int j = i;
            while (j > 0 && (ascOrder ? array[j-1] > cur : array[j-1] < cur)) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = cur;
        }
    }

    public void quickSort(boolean ascOrder) {
        quickSortRange(ascOrder, 0, length);
    }

    private void quickSortRange(boolean ascOrder, int low, int high) {
        if (low >= high - 1)
            return;
        int pivot = array[high - 1];
        int j = low;
        for (int i = low; i < high - 1; i++) {
            if (ascOrder ? array[i] <= pivot : array[i] >= pivot) {
                swapIdx(i, j);
                j++;
            }
        }
        swapIdx(j, high - 1);
        quickSortRange(ascOrder, low, j);
        quickSortRange(ascOrder, j + 1, high);
    }
}
