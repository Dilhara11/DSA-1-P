public class NoDupArrayApp {
    public static void main(String[] args) {
        NoDupArray numbers = new NoDupArray(50);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);

        System.out.println("When entered duplicate values :");
        numbers.insert(10);

        System.out.println("Printing the initial array :");
        numbers.display();

        System.out.println("Is 40 available in the array? :");
        System.out.println(numbers.find(40));

        System.out.println("Deleting 20 from array :");
        System.out.println(numbers.delete(20));

        System.out.println("Print array :");
        numbers.display();
    }
}
