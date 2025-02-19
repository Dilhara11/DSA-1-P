package Question_01;

public class InsertionSortArray {
    private long[] a; // ref to array a
    private int nElems; // number of data items

    // Constructor
    public InsertionSortArray(int max) {
        a = new long[max]; // create the array
        nElems = 0; // no items yet
    }

    public void insert(long value) { // put elements into array
        a[nElems] = value; // insert it
        nElems++; // increment the size
    }

    public void insertionSort() {
        for (int i = 1; i < nElems; i++) { // Outer loop for iterating through array
            long key = a[i];
            int j = i - 1;

            // Corrected shifting logic
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j]; // Shift element to the right
                j--;
            }
            a[j + 1] = key; // Insert the key at the correct position
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) { // Fix loop condition
            System.out.print(" " + a[i]);
        }
        System.out.println(); // New line after printing
    }
}
