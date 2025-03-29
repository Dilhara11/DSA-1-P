package Q2;

public class LinkedList {
    private Node head = null; //tracks head
    private Node current; // for traversal
    private Node newNode;

//    to insert at the beginning
    public void prepend(int id, String description){
        newNode = new Node(id, description);
        if(head == null) head = newNode; // check if list is empty
        else {
            newNode.next = head;
            head = newNode;
        }
    }

//    to insert at the end
    public void append(int id, String description){
        newNode = new Node(id, description);
        current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

//    insert at specific position
    public void insert(int position, int id, String description){
        newNode = new Node(id, description);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        Node previous = null;
        int posi = 1;

        while (current != null && posi < position) {
            previous = current;
            current = current.next;
            posi++;
        }

        if (posi != position) {
            System.out.println("ERROR: Invalid Position");
            return;
        }

        newNode.next = current;
        previous.next = newNode;
    }

//    question 03
//    Method to delete head of the taskList
    public void deleteFirst(){
        Node temp = head;
        if(head == null) System.out.println("ERROR: List is Empty.");
        else head = head.next;
    }

//    displaying tasks
    public String display() {
        current = head;
        if (head != null) {
            System.out.println("Task List");
            while (current != null) {
                System.out.printf("""
        %d   -->  %s
               |
               v        
                        """, current.id, current.description);
                current = current.next;
            }
            return "ADD another Task!!";
        } else return "ERROR: Empty List.";
    }

}
