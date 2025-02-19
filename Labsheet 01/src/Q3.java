import java.util.Scanner;

public class Q3 {


    public static void retriveFromTheLast(String[] array, int count){
        int maxIndex = array.length - 1;
        System.out.print("Orders: ");
        for (int i = maxIndex; i > maxIndex - count; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] foods = {"Pizza", "Bread", "Steak", "Fish", "Shrimp", "Sushi", "Sandwich"};
        int n = 0;


        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Orders to retrieve: ");
        n = input.nextInt();

        Q3.retriveFromTheLast(foods, 2);
    }
}