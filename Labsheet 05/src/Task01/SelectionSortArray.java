package Task01;

public class SelectionSortArray {
    private long[] a;
    private int nElems; //to track number of elements

    public SelectionSortArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public long getA(int index) {
        return a[index];
    }

    //method to insert value to the array
    public void insert(long value){
        //checking space of the array
        if (nElems >= a.length){
            System.out.println("Can't insert value due to " +
                    "insufficient space.");
        }else {
            a[nElems] = value;
            nElems++;
        }
    }

    //to swap two numbers
    private void swap(int one, int two){
        long temp;
        temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    //two selection sort
    public void selectionSort(){
        for (int i = 0; i < nElems - 1; i++) {
            int minIndex = i;  // Assume the minimum is the current index

            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < nElems; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;  // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the first unsorted element
            if (minIndex != i) {
                swap(i, minIndex);
            }
        }
    }

    public void display(){
        for (int i = 0; i < a.length; i++) System.out.print(" " + a[i]);
        System.out.println(" ");
    }


}
