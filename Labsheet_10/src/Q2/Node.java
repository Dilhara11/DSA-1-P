package Q2;

public class Node {
//    these two variables describe data in the node
    public int id;
    public String description;

//    this variable hold next node address
    Node next;
    public Node(int id, String description) {
        this.id = id;
        this.description = description;
        this.next = null;
    }
}
