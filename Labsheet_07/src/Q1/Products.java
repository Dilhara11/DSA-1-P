package Q1;

import java.util.Scanner;

public class Products {
    public static boolean binarySearch(int[] arraySearch, int searchKey){
        int left = 0;
        int right = arraySearch.length - 1;
        int mid;

        while (left <= right){
            mid = left + (right-left)/2;
            if(arraySearch[mid] == searchKey) return true;
            if(arraySearch[mid] < searchKey) left = mid + 1;
            if(arraySearch[mid] > searchKey) right = mid - 1;
        }

        return false;

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Price: ");
        int searchPrice = input.nextInt();

        int[] productPrices = {5, 12, 15, 20, 30, 45, 60, 75};


        if (binarySearch(productPrices, searchPrice))
            System.out.println("Product Found!");
        else
            System.out.println("Product Not Found! \n");
    }
}
