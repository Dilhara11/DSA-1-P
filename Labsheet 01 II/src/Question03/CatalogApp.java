package Question03;

public class CatalogApp {
    public static void main(String[] args) {
        Catalog catalog = new Catalog(50);

        catalog.insert("The Great Gatsby");
        catalog.insert("To Kill a Mockingbird");
        catalog.insert("1984");
        catalog.insert("Moby Dick");
        catalog.insert("Pride and Prejudice");

        //displaying books
        catalog.display();

        //search for book
        System.out.println("\nSearching for: 1984 " + (catalog.find("1984") != -1));

        //deleting a book
        boolean isDeleted = catalog.delete("Moby Dick");
        System.out.println("\nDeleted 'Moby Dick': " + isDeleted);

        System.out.println("\n");
        //displaying books
        catalog.display();
    }
}
