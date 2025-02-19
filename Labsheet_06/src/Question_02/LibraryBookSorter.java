package Question_02;

public class LibraryBookSorter {
    private int[] bookIDs;
    private int nElems;

    public LibraryBookSorter(int max) {
        bookIDs = new int[max];
        nElems = 0;
    }

    public void insert(int newID) { // put elements into array
        bookIDs[nElems] = newID; // insert it
        nElems++; // increment the size
    }

    public void insertionSort() {
        for (int i = 1; i < nElems; i++) { // Outer loop for iterating through array
            int key = bookIDs[i];
            int j = i - 1;

            // Corrected shifting logic
            while (j >= 0 && bookIDs[j] > key) {
                bookIDs[j + 1] = bookIDs[j]; // Shift element to the right
                j--;
            }
            bookIDs[j + 1] = key; // Insert the key at the correct position
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) { // Fix loop condition
            System.out.print(" " + bookIDs[i]);
        }
        System.out.println(); // New line after printing
    }
}

