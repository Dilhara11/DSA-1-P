package Task01;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SelectionSortArray selectionSortArray = new SelectionSortArray(10000);

        Random random = new Random();

        for (int i = 0; i<10000; i++){
            int rndNumber = random.nextInt(100000) + 1;
            selectionSortArray.insert(rndNumber);
        }
        long startTime = System.nanoTime();
        selectionSortArray.selectionSort();
        long endTime = System.nanoTime();
        selectionSortArray.display();
        long time = endTime - startTime;
        System.out.println("Time: " + time +"ns");

        startTime = System.nanoTime();
        selectionSortArray.insert(32412);
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("Time: " + time +"ns");
    }
}
