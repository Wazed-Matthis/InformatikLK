package wtf.wazed.tasks.impl;

import wtf.wazed.tasks.GenericTask;

/**
 * @author Wazed
 * Created on 22.09.2020
 */
public class BinarySearch extends GenericTask {

    private final int[] nums = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 70, 80};

    @Override
    public void execute() {
        System.out.println(binarySearchOutline(20));
    }

    public int binarySearchOutline(int searching){
        return binarySearch(nums, searching,0,nums.length);
    }

    public int binarySearch(int[] a,int searching, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            //Ist das Element an Stelle der aktuellen Mitte
            if (a[mid] == searching)
                return mid;

            //Wenn Zahl an der Stelle mid kleiner als die gesuchte Zahl setze rechte Grenze auf mid-1
            if (a[mid] > searching)
                return binarySearch(a,searching, left, mid - 1);

            //Wenn nicht, dann setze linke Grenze auf mid+1
            return binarySearch(a,searching, mid + 1, right);
        }

        // Wenn die Zahl nicht gefunden wird, dann gib -1 zurück
        return -1;
    }
}