package Q1;

public class Node {
    public int data;
    public Node next; // this is to store memory address of the next node

//    constructor not to initialize the node
    public Node(int item) {
        this.data = item;
        next = null;
    }
}
