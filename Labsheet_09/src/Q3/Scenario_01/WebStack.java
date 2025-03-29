

/*
* Best Data Structure: Stack
  Justification:
  * A stack follows the LIFO (Last In, First Out) principle,
* which is ideal for navigation history. When a user visits a new page,
* it's pushed onto the stack. If they go back, the last visited page is popped,
* and another stack can store the forward history.
* This allows smooth back and forward navigation.
* */


package Q3.Scenario_01;

public class WebStack {
    private int maxSize;

    private String [] stackData;
    private int top;

    public WebStack(int maxSize) {
        this.maxSize = maxSize;
        stackData = new String[maxSize];
        top = -1;
    }

    public void Visit(String pushingSite){
        if(isFull()){
            System.out.println("History is Full cannot visit page " + pushingSite);
            return;
        }else {
            stackData[++top] = pushingSite;
            System.out.println("Visited: " + pushingSite);
        }
    }

    public String goingBack(){
        if (isEmpty()) {
            System.out.println("Error: Can't delete History is empty!");
            return null;
        }else {
            String removedData = stackData[--top];
            return removedData;
        }
    }

    public String goingForward (){
        if (isFull()) {
            System.out.println("Error: can't Forward");
            return null;
        } else {
            return stackData[++top];
        }
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
