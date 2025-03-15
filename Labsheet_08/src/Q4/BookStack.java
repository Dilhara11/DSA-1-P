package Q4;

import java.util.Scanner;
import java.util.Stack;

public class BookStack {
    public static void main(String[] args) {
        //variable stack
        Scanner input = new Scanner(System.in);
        int chosenNumber = 0;
        Stack<String> books = new Stack<>();
        String bookName = null;

        // User Menu
        do {
            System.out.println("+++++MENU+++++");
            System.out.println("1.Return Book.");
            System.out.println("2.Shelve Book.");
            System.out.println("3.Recent Book.");
            System.out.println("4.Display.");
            System.out.println("5.Exit.");
            System.out.print("Choose: ");
            chosenNumber = input.nextInt();

            input.nextLine(); // for consume the \n left by nextInt

//            menu architecture
            switch (chosenNumber){
                case 1:
                    System.out.print("Enter Book Name: ");
                    bookName = input.nextLine();
                    books.push(bookName);
                    System.out.println("Returned: " + bookName);
                    break;
                case 2:
                    if(!books.isEmpty()){
                        System.out.println("Shelving: " + books.pop());
                    }else {
                        System.out.println("Stack is Empty!");
                    }
                    break;
                case 3:
                    System.out.println("Top Book: " + books.peek());
                    break;
                case 4:
                    if (!books.isEmpty()){
                        System.out.print("Current Stack: " + books);
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
