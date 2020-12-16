package wtf.wazed.tasks.impl;

import wtf.wazed.tasks.GenericTask;

import java.util.Arrays;

/**
 * @author Wazed
 * Created on 22.09.2020
 */
public class QuickSort extends GenericTask {

    int[] nums = new int[]{1, 23, 24, 634, 7, 124, 2, 427, 35, 7, 235, 3, 6, 24, 72, 47};

    @Override
    public void execute() {
        /*System.out.println(nums.length);
        quickSortIterative(nums);
        System.out.println(Arrays.toString(nums));*/
    }

    public void quickSort(int[] a) {
        quickSortInline(a, 0, a.length - 1);
    }

    public void quickSortIterative(int[] a) {
        quickSortIterativeInline(a, 0, a.length - 1);
    }

    /**
     * Quicksort algorithm in iterative Version
     * @param a
     * @param low
     * @param high
     */
    private void quickSortIterativeInline(int[] a, int low, int high) {

        // Erstelle SortierStack in dem gearbeitet wird
        final int[] sortingStack = new int[high - low + 1];

        // Initialisiere die obere Grenze des Arrays
        int topIndex = -1;

        //Schiebe die originalen Werte von low und high in den Stack
        sortingStack[++topIndex] = low;
        sortingStack[++topIndex] = high;

        //Gehe weiter solange der stack nicht leer ist
        while (topIndex >= 0) {

            //Nehme neuen Wert von low und high aus dem Stack
            high = sortingStack[topIndex--];
            low = sortingStack[topIndex--];

            //Setze den pivotPoint
            int pivotPoint = partition(a, low, high);

            //Wenn Elemente links vom PivotPoint sind, dann Pushe sie nach ganz oben
            if (pivotPoint - 1 > low) {
                sortingStack[++topIndex] = low;
                sortingStack[++topIndex] = pivotPoint - 1;
            }
            //Wenn Elemente rechts vom PivotPoint sind, dann Pushe sie nach ganz unten
            if (pivotPoint + 1 < high) {
                sortingStack[++topIndex] = pivotPoint + 1;
                sortingStack[++topIndex] = high;
            }
        }
    }

    private void quickSortInline(int[] a, int low, int high) {
        if (low < high) {
            int part = partition(a, low, high);
            quickSortInline(a, low, part - 1);
            quickSortInline(a, part + 1, high);
        }
    }

    private int partition(int[] a, int low, int high) {
        int pivotPoint = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] < pivotPoint) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, high);

        return i + 1;
    }

    private void swap(int[] a, int index, int index1) {
        int temp = a[index];
        a[index] = a[index1];
        a[index1] = temp;
    }

}
