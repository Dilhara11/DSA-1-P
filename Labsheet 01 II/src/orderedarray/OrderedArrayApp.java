package orderedarray;

public class OrderedArrayApp {
    public static void main(String[] args) {
        OrderedArray orderedArray = new OrderedArray(10);

        orderedArray.insert(20);
        orderedArray.insert(10);
        orderedArray.insert(30);
        orderedArray.insert(15);

        orderedArray.display();

        System.out.println("Find 15: " + orderedArray.find(15));
        System.out.println("Delete 20: " + orderedArray.delete(20));

        orderedArray.display();


    }
}
