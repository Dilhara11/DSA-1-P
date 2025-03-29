package Q2;

import java.util.Scanner;

public class Scheduler {
    static LinkedList taskList = new LinkedList();
    static Scanner input = new Scanner(System.in);
    static int id = 0;

    private static String prepend(){
        System.out.print("Enter Task Name: ");
        String taskName = input.nextLine();
        taskList.prepend(id, taskName);
        id++;
        return "Task Added At the Beginning!";
    }

    private static String append() {
        System.out.print("Enter Task Name: ");
        String taskName = input.nextLine();
        taskList.append(id, taskName);
        id++;
        return "Task Added At the end!";
    }

    private static String insert() {
        System.out.print("Enter Task Name: ");
        String taskName = input.nextLine();
        System.out.print("Enter Position: ");
        int taskPosi = input.nextInt();
        taskList.insert(taskPosi, id, taskName);
        id++;
        return "Task Added At the Position " + taskPosi;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;
        do{
            System.out.println("""
                    
                    
                    ##### MENU #####
                    
                    1. Prepend Task
                    2. Append Task
                    3. Insert at Position
                    4. Display Schedule
                    5. exit
                    """);

            System.out.print("Enter Choice: "); choice = input.nextInt();

            String statement = switch (choice) {
                case 1 -> prepend();
                case 2 -> append();
                case 3 -> insert();
                case 4 -> taskList.display();
                case 5 -> "Exiting...";
                default -> "ERROR: Invalid Option!";
            };

            System.out.println(statement);
        }while(choice != 5);

        //to test head deletion method

//        taskList.deleteFirst();
//        taskList.display();
    }
}
