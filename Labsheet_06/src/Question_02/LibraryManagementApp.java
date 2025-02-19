package Question_02;

public class LibraryManagementApp {
    public static void main(String[] args) {
        LibraryBookSorter books = new LibraryBookSorter(10);

        books.insert(1023);
        books.insert(895);
        books.insert(1201);
        books.insert(543);
        books.insert(764);
        books.insert(980);

        System.out.println("Books Before Sorting: ");
        books.display();
        books.insertionSort();
        System.out.println("Books After Sorting: ");
        books.display();
    }
}
