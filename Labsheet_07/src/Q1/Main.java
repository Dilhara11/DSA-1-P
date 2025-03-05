package Q1;

public class Main {
    public static int binarySearch(int[] arraySearch, int searchKey){
        int left = 0;
        int right = arraySearch.length - 1;
        int mid;

        for (int i = 0; i < 10; i++) {
            if (searchKey == arraySearch[i]) {
                System.out.printf("Found %d at index %d \n", searchKey, i);
                break;
            }

        }
        while (left <= right){
            mid = left + (right-left)/2;
            if(arraySearch[mid] == searchKey) return mid;
            if(arraySearch[mid] < searchKey) left = mid + 1;
            if(arraySearch[mid] > searchKey) right = mid - 1;
        }

        return -1;

    }
    public static void main(String[] args) {
        int[] arrayNum = {2,4,5,7,10,45,67,74,75,80}; //defined array

        int searchNum = 100; //to hold number for search

        System.out.println("Array Elements Are: ");
        for(int i = 0; i < 10; i++){
            System.out.print(" " + arrayNum[i]);
        }
        System.out.println("");

        int result = binarySearch(arrayNum, searchNum);

        if(result != -1) System.out.println("Elements was Found at index " + result);
        if(result == -1) System.out.println("Elements was not Found!");
    }
}
