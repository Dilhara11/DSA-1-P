package Question02;

import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        Random random = new Random();
        for(int i = 0; i< 1000; i++){
            arr[i] = random.nextInt(100) + 1;
        }

        //for find element 12 in arr
        long startTime = System.nanoTime();
        for(int i = 0; i < 1000; i++){
            if(arr[i] == 12){
                System.out.println("Index: " + i);
                break;
            }
        }
        long endTime = System.nanoTime();
        long time = endTime - startTime;
        System.out.println("Execution time for the operation: " + time);

        //to find specific element in array system have to go through array elements
        // one by one hence it has linear time complexity at worst case
    }
}
