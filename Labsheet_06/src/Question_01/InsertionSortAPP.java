package Question_01;

public class InsertionSortAPP {
    public static void main(String[] args) {

    InsertionSortArray arr = new InsertionSortArray(10);
        arr.insert(5);
        arr.insert(3);
        arr.insert(8);
        arr.insert(1);
        arr.insert(2);

        System.out.println("Before Sorting:");
        arr.display();

        arr.insertionSort();

        System.out.println("After Sorting:");
        arr.display();
}
}
