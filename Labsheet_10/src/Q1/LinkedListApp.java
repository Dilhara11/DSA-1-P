package Q1;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(5);
        linkedList.insert(2);
        linkedList.insert(6);

        linkedList.display();

        linkedList.insert(1);

        linkedList.display();

        linkedList.append(10);
        linkedList.append(20);

        linkedList.display();

        linkedList.inserAtPosi(3, 3);

        linkedList.display();


    }
}
