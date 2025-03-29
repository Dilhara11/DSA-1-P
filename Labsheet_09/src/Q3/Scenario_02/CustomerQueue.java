
/*
*
* Best Data Structure: Queue
Justification: A queue follows the FIFO (First In, First Out) principle, which ensures customers are served in the order they call.
* The first customer to enter the queue is the first to be assisted, maintaining fairness in handling inquiries.
* */

package Q3.Scenario_02;

public class CustomerQueue {
    private int maxSize;
    private String[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    //constructor

    public CustomerQueue(int max) {
        maxSize = max;
        queueArray = new String[max];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    //insert from rear;
    public void add(String value){
        if(isFull()) System.out.println("Cannot insert! queue is full!");
        else{
            queueArray[++rear] = value;
            System.out.println("Customer added: " + value);
            nItems++;
        }
    }

    //remove from the front
    public String serve(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return null;
        }else {
            String servedCustomer = queueArray[front++];
            return servedCustomer;
        }
    }

    public void display(){
        System.out.print("Customer in Line: ");
        for(int i = front; i <= rear; i++){
            System.out.print(queueArray[i] + " ");
        }
        System.out.println(" ");
    }

    public String front(){
        return queueArray[front];
    }

    //check if empty
    public boolean isEmpty(){
        return (nItems == 0);
    }

    //check is full
    public boolean isFull(){
        return (nItems == maxSize);
    }
}
