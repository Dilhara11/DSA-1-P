import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        int[] marks = new int[5];
        int total = 0;
        float average;

        Scanner input = new Scanner(System.in);

        for(int i = 0; i<5; i++){
            System.out.print("Enter marks: ");
            marks[i] = input.nextInt();
        }

        for (int i = 0 ; i<5; i++){
            total = total + marks[i];
        }

        average = total/5;
        System.out.println("Average: "+average);
    }
}
