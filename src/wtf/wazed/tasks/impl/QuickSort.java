package wtf.wazed.tasks.impl;

import wtf.wazed.tasks.GenericTask;

import java.util.Arrays;

/**
 * @author Wazed
 * Created on 22.09.2020
 */
public class QuickSort extends GenericTask {

    int[] nums = new int[]{1,23,24,634,7,124,2,427,35,7,235,3,6,24,72,47};

    @Override
    public void execute() {
        quickSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void quickSort(int[] a){
        quickSortInline(a, 0, a.length-1);
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

        return i+1;
    }

    private void swap(int[] a, int index, int index1) {
        int temp = a[index];
        a[index] = a[index1];
        a[index1] = temp;
    }

}
