/*
Using Stack<T> from Java Collections is the better choice
because it is dynamically resizable, making it more flexible
for varying numbers of plates.

An array-based stack has a fixed size,
which could lead to wasted memory (if oversized) or require
resizing (which is inefficient).

Memory Usage:
Arrays use a fixed amount of memory, which can be wasteful
if not fully utilized.
Java's Stack<T>  grows dynamically, using memory efficiently.

Performance:
Both implementations have O(1) time complexity
for push, pop, and peek.
Resizing an array incurs O(n) cost when the array
needs to be expanded, while Stack<T> handles this internally.

*/
package Q3;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class PlateStack {
    public static void main(String[] args) {
        //variable stack
        Scanner input = new Scanner(System.in);
        int chosenNumber = 0;
        Stack<Integer> plates = new Stack<>();
        int plateNumber = 0;

        // User Menu
        do {
            System.out.println("+++++MENU+++++");
            System.out.println("1.ADD clean Plates.");
            System.out.println("2.Take clean Plates.");
            System.out.println("3.TOP plate.");
            System.out.println("4.Display.");
            System.out.println("5.Exit.");
            System.out.print("Choose: ");
            chosenNumber = input.nextInt();

//            menu architecture
            switch (chosenNumber){
                case 1:
                    System.out.print("Enter Plate Number: ");
                    plateNumber = input.nextInt();
                    plates.push(plateNumber);
                    System.out.println("Added Plate: " +plateNumber);
                    break;
                case 2:
                    if(!plates.isEmpty()){
                        System.out.println("Serving: Removed Plate " + plates.pop());
                    }else {
                        System.out.println("Stack is Empty!");
                    }
                    break;
                case 3:
                    System.out.println("Top Plate: " + plates.peek());
                    break;
                case 4:
                    if (!plates.isEmpty()){
                        System.out.print("Current Stack: ");
                        Iterator<Integer> iterator = plates.iterator();
                        while (iterator.hasNext()){
                            System.out.print("Plate: " + iterator.next() + " ");
                        }
                        System.out.println(" ");
                    }else {
                        System.out.println("Stack is Empty!");
                    }
                case 5:
                    System.out.println("Exiting...");
//                    input.close(); // there is an error using this here
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while(chosenNumber != 5);



    }

}
