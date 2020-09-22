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
        //System.out.println(binarySearchOutline(nums, 20));
    }

    /**
     * Rahmenfunktion für binäre Suche
     * @param searching
     * @return
     */
    public int binarySearchOutline(int[] a, int searching){
        return binarySearch(a, searching,0,nums.length - 1);
    }

    /**
     *
     * @param a das array in dem gesucht wird
     * @param searching die Zahl die gesucht wird
     * @param left die linke Grenze des Suchbereichs (wichtig für Rekursion)
     * @param right die rechte Grenze des suchbereichs (wichtig für Rekursion)
     * @return den index der gesuchten Zahl
     */
    private int binarySearch(int[] a,int searching, int left, int right) {
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