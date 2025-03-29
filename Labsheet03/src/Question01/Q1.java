package Question01;

public class Q1 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int total = 3 + 5;
        long endTime = System.nanoTime();
        long time = endTime - startTime;
        System.out.println("Total Time : " + time);

            //Its varies depend on operation(time complexity)

        //basic operations got constant time
        //loop operations got linear time
        //sorting operations got O(n long n) or O(n^2)
        //recursive operations got exponential time in worst cases

            //why its important//

        //efficiency matters
        //Scalability
        //Resource Management
        //real time constraints
    }
}
