package Q1;


public class    LinkedList {
    Node head;

    public void insert(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void append(int val){
        Node current = head;
        Node newNode;
        while (current.next != null){
            current = current.next;
        }
        if(current.next == null){
            newNode = new Node(val);
            current.next = newNode;
        }

    }

    public void inserAtPosi(int posi, int val){
        Node current = head;
        Node newNode;
        int i = 1;
        if(current.next == null) System.out.println("ERROR: Empty Array!");
        while(i != posi){
            current = current.next;
            break;
        }

        newNode = new Node(val);
        newNode.next = current.next;
        current.next = newNode;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}
