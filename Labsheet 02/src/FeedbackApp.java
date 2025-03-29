import java.util.Random;

public class FeedbackApp {
    public static void main(String[] args) {
        //checking execution time for 100 insertions
        Feedback feedbacks = new Feedback(100);
        //for random numbers
        Random random = new Random();
        int rating;
        long toWholeStartTime = System.nanoTime();
        for(int i = 0; i < 100; i++){
            rating = random.nextInt(5) + 1;
            long startTime = System.nanoTime();
            feedbacks.insert(rating);
            long endTime = System.nanoTime();
            long insertionTime = endTime - startTime;
            System.out.println("Time to insert: " + insertionTime + " nano seconds");
        }
        long toWholeEndTime = System.nanoTime();

        long wholeInsertionTime = toWholeEndTime - toWholeStartTime;
        System.out.println("Time to insert whole: " + wholeInsertionTime + " nano seconds");


        //checking to find the first occurrence of a specific number
        long startTime = System.nanoTime();
        feedbacks.find(5);
        long endTime = System.nanoTime();
        long findingTime = endTime - startTime;
        System.out.println("Time to find: " + findingTime + " nano seconds");


        //checking time to delete all occurrences of a specific number
        startTime = System.nanoTime();
        feedbacks.delete(2);
        endTime = System.nanoTime();
        long deletionTime = endTime - startTime;
        System.out.println("Time to Delete: " + deletionTime + " nano seconds");

        //time complexity analy
    }


}
