package Q2;

public class BrowsingHistory {
    public static void main(String[] args) {
        StackArray historyArray = new StackArray(5);
        int currentPage, removedItem;

        historyArray.push(101);
        historyArray.push(102);
        historyArray.push(103);
        historyArray.push(104);
        historyArray.push(105);

        System.out.print("Browser History: ");
        historyArray.display();
        //trying to visit page 106
        historyArray.push(106);
        //current page
        currentPage = historyArray.peek();
        System.out.println("Current page: " + currentPage);

        //going back
        removedItem = historyArray.pop();
        System.out.println("Poped: " + removedItem);

        System.out.print("Updated History: ");
        historyArray.display();

        currentPage = historyArray.peek();
        System.out.println("Current page: " + currentPage);





    }
}
