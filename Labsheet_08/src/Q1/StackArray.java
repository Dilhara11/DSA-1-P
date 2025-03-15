package Q1;

public class StackArray {
    private int maxSize;

    private int [] stackData;
    private int top;

    public StackArray(int maxSize) {
        this.maxSize = maxSize;
        stackData = new int[maxSize];
        top = -1;
    }

    public void push(int pushingNumber){
        if(isFull()){
            System.out.println("Error: Can't insert Stack is FUll");
            return;
        }else {
//            top++;
            stackData[++top] = pushingNumber;
        }
    }

    public int pop(){
        if (isEmpty()) {
            System.out.println("Error: Can't POP stack is empty!");
            return -1;
        }else {
            int removedData = stackData[top--];
//            top--;
            return removedData;
        }
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
