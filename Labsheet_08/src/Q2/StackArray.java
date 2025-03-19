package Q2;

public class StackArray {
    private final int maxSize;

    private int [] stackData;
    private int top;

    public StackArray(int maxSize) {
        this.maxSize = maxSize;
        stackData = new int[maxSize];
        top = -1;
    }

    public void push(int pushingNumber){
        if(isFull()){
            System.out.println("History is Full cannot visit page " + pushingNumber);
            return;
        }else {
            stackData[++top] = pushingNumber;
        }
    }

    public int pop(){
        if (isEmpty()) {
            System.out.println("Error: Can't delete History is empty!");
            return -1;
        }else {
            System.out.println("Going Back...");
            int removedData = stackData[top--];
            return removedData;
        }
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Array is Empty!");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stackData[i] + " " );
        }
        System.out.println(" ");
    }

    public int peek(){
        return stackData[top];
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
