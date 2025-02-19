package Question03;

public class Catalog {
    private String[] books;
    private int nElems;

    public Catalog(int max) {
        books = new String[max];
        nElems = 0;
    }

    public void insert(String book)
    {
        int j;

        //finding the position for new value
        for(j = 0; j < nElems; j++){
            if(books[j].compareTo(book) > 0) break;
        }

        //shift elements to make room
        for(int k = nElems; k > j; k--) books[k] = books[k - 1];

        books[j] = book;
        nElems++;
    }

    // Display all books
    public void display() {
        System.out.println("-----Books in Alphabetical Order-----");
        System.out.print("\t");
        for (int i = 0; i < nElems; i++) {
            System.out.print(books[i] + " ");
        }
        System.out.println();
    }

    // Binary search to find the index of the book
    public int find(String key) {
        int lowerBound = 0;
        int upperBound = nElems - 1;

        while (lowerBound <= upperBound) {
            int mid = (lowerBound + upperBound) / 2;

            int comparison = books[mid].compareTo(key);
            if (comparison == 0) return mid; // Found the book
            else if (comparison < 0) lowerBound = mid + 1; // Search right half
            else upperBound = mid - 1; // Search left half
        }
        return -1; // Book not found
    }

    // Delete a book from the list
    public boolean delete(String key) {
        int index = find(key);
        if (index == -1) return false; // Book not found

        // Shift elements to the left to delete the book
        for (int i = index; i < nElems - 1; i++) {
            books[i] = books[i + 1];
        }

        nElems--;
        return true;
    }
}
