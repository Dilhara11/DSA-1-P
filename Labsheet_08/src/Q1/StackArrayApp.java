package Q1;

public class StackArrayApp {
    public static void main(String[] args) {
        StackArray stackArray = new StackArray(10);
        stackArray.push(10);
        stackArray.push(20);
        stackArray.push(30);
        stackArray.push(40);
        stackArray.push(50);
        stackArray.push(60);

        //cant directly pop 30
        //have to pop from top
        int removedItem;
        removedItem = stackArray.pop();
        System.out.println("Removed: " + removedItem);
        removedItem = stackArray.pop();
        System.out.println("Removed: " + removedItem);
        removedItem = stackArray.pop();
        System.out.println("Removed: " + removedItem);
        removedItem = stackArray.pop();
        System.out.println("Removed: " + removedItem);
    }
}
