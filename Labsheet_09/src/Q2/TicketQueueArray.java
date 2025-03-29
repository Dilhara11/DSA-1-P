package Q2;

public class TicketQueueArray {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    //constructor

    public TicketQueueArray(int max) {
        maxSize = max;
        queueArray = new int[max];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    //insert from rear;
    public void insert(int value){
        if(isFull()) System.out.println("Cannot insert! queue is full!");
        else{
            queueArray[++rear] = value;
            nItems++;
        }
    }

    //remove from the front
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return 0;
        }else {
            front++;
        }
        return 0;
    }

    //check if empty
    public boolean isEmpty(){
        return (nItems == 0);
    }

    //check is full
    public boolean isFull(){
        return (nItems == maxSize);
    }

    public void display(){
        System.out.println("Customer Lineup: ");
        for(int i = front; i <= rear; i++){
            System.out.print(queueArray[i] + " ");
        }
        System.out.println(" ");
    }
}
