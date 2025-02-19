import java.util.Scanner;

public class Q1 {
    public static void main(String[] a){
        int marks1 = 0;
        int marks2 = 0;
        int marks3 = 0;
        int marks4 = 0;
        int marks5 = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Marks1: ");
        marks1 = input.nextInt();
        System.out.print("Enter Marks2: ");
        marks2 = input.nextInt();
        System.out.print("Enter Marks3: ");
        marks3 = input.nextInt();
        System.out.print("Enter Marks4: ");
        marks4 = input.nextInt();
        System.out.print("Enter Marks5: ");
        marks5 = input.nextInt();

        int total = marks1 + marks2 + marks3 + marks4 + marks5;
        float average = total/5;

        System.out.println("Average: " + average);
    }
}
