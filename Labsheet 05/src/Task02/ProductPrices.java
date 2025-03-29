package Task02;

import Task01.SelectionSortArray;

public class ProductPrices {
    public static void main(String[] args) {
        Task01.SelectionSortArray selectionSortArray = new SelectionSortArray(12);
        selectionSortArray.insert(1200);
        selectionSortArray.insert(850);
        selectionSortArray.insert(1999);
        selectionSortArray.insert(750);
        selectionSortArray.insert(1600);
        selectionSortArray.insert(950);
        selectionSortArray.insert(650);
        selectionSortArray.insert(1800);
        selectionSortArray.insert(2200);
        selectionSortArray.insert(1050);
        selectionSortArray.insert(1400);
        selectionSortArray.insert(1750);

        System.out.println("Before sorting:");
        selectionSortArray.display();
        long startTime = System.nanoTime();
        selectionSortArray.selectionSort();
        long endTime = System.nanoTime();
        long time = endTime - startTime;
        System.out.println("Time: " + time + "ns");
        selectionSortArray.display();
        System.out.println("Highes: " + selectionSortArray.getA(0));
        System.out.println("Lowest: " + selectionSortArray.getA(11));

        //best-case

        //best case occurs when array is already sorted
        //time complexity O(n^2) because algorithm still checks code regardless
        //but number of swapping is 0  since algorithm checks before swapping

        //worst-case

        //worst case occur when array is completely reversed
        //time complexity O(n^2)
        //number of swapping n-1 (swap for each pass)

    }
}
